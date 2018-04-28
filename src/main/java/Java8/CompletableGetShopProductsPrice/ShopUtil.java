package Java8.CompletableGetShopProductsPrice;

import java.util.ArrayList;
import java.util.List;

public class ShopUtil {

  public static void main(String[] args) {
    List<Product> productList = new ArrayList<>();
    Product product = new Product("Pen", "ordinary", 50.00);
    productList.add(product);
    Product product1 = new Product("notebook", "ordinary", 100.00);
    productList.add(product1);
    Product product2 = new Product("javaBook", "medium", 999.00);
    productList.add(product2);
    Product product3 = new Product("Lanwire", "medium", 215.00);
    productList.add(product3);
    Product product4 = new Product("laptop", "luxary", 47999.00);
    productList.add(product4);
    Product product5 = new Product("headphone", "luxary", 12999.00);
    productList.add(product5);
    Product product6 = new Product("Daal", "nonIncluded", 100.00);
    productList.add(product6);
    Shop shop = new Shop("ModernKirana", "Rituraj", productList);

    long start = System.nanoTime();
    Double price = shop.getPriceWithSynced(product);
    long invocationTime = ((System.nanoTime()) - start) / 1000000;
    System.out.println("Invocation returned after: " + invocationTime + " msec");

    // Do some more task
    doSomethingElse();

    System.out.println("Price is:   " + price);

    long retrievalTime = ((System.nanoTime()) - start) / 1000000;
    System.out.println("Price returned after:  " + retrievalTime + " msec");
  }

  private static void doSomethingElse() {
    try {
      Thread.sleep(5000L);
      System.out.println("doing something else");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
