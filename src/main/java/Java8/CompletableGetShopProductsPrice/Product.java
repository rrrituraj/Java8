package Java8.CompletableGetShopProductsPrice;

public class Product {

  private Double price;
  private String name;
  private String category;

  public Product() {
  }

  public Product(String name, String category, Double price) {
    this.price = price;
    this.name = name;
    this.category = category;
  }

  public Double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public String getCategory() {
    return category;
  }
}
