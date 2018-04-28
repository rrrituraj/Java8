package Java8.CompletableGetShopProductsPrice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Shop {

  private String name;
  private String ownerName;
  private List<Product> productList;

  public Shop() {
  }

  public Shop(String name, String ownerName) {
    this.name = name;
    this.ownerName = ownerName;
  }

  public Shop(String name, String ownerName, Product product) {
    this.name = name;
    this.ownerName = ownerName;
    this.productList = new ArrayList<>();
    productList.add(product);
  }

  public Shop(String name, String ownerName, List<Product> productList) {
    this.name = name;
    this.ownerName = ownerName;
    this.productList = productList;
  }

  public String getName() {
    return name;
  }

  public String getOwnerName() {
    return ownerName;
  }

  private List<Product> getProductList() {
    return productList;
  }

  public CompletableFuture<Double> getPriceAsync(Product product) {
    CompletableFuture<Double> futurePrice = new CompletableFuture<>();
    new Thread(
        () -> {
          futurePrice.complete(priceCalculate(product));
        })
        .start();
    return futurePrice;
  }

  public Double getPriceWithSynced(Product product) {
    return priceCalculate(product);
  }

  public CompletableFuture<Double> getPriceWithSupplySync(Product product) {
    return CompletableFuture.supplyAsync(() -> priceCalculate(product));
  }

  private Double priceCalculate(Product product) {
    Double price = 0.00;
    if (getProductList().contains(product)) {

      if (product.getCategory().equalsIgnoreCase("ordinary")) {
        price = GstAdder.calculatePrice(product);
        price = price + price * 0.10;
      } else if (product.getCategory().equalsIgnoreCase("medium")) {
        price = GstAdder.calculatePrice(product);
        price = price + price * 0.20;
      } else if (product.getCategory().equalsIgnoreCase("luxary")) {
        price = GstAdder.calculatePrice(product);
        price = price + price * 0.30;
      } else {
        price = GstAdder.calculatePrice(product);
      }
    } else {
      try {
        throw new ProductNotAvailable("Product not available to Store");
      } catch (ProductNotAvailable productNotAvailable) {
        productNotAvailable.printStackTrace();
      }
    }
    try {
      Thread.sleep(3000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return price;
  }
}
