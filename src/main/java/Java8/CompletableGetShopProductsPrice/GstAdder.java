package Java8.CompletableGetShopProductsPrice;

public class GstAdder {

  public static Double calculatePrice(Product product) {
    if (product.getCategory().equalsIgnoreCase("Ordinary")) {
      return product.getPrice() + product.getPrice() * 0.050;
    } else if (product.getCategory().equalsIgnoreCase("medium")) {
      return product.getPrice() + product.getPrice() * 0.180;
    } else if (product.getCategory().equalsIgnoreCase("luxary")) {
      return product.getPrice() + product.getPrice() * 0.280;
    } else {
      return product.getPrice();
    }
  }
}
