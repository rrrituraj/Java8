package Java8.CompletableGetShopProductsPrice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ShopUtilWithSupplySync1 {


  public static void main(String[] args) throws ExecutionException, InterruptedException {
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
    CompletableFuture<Double> future = CompletableFuture
        .supplyAsync(() -> shop.getPriceWithSynced(product));
    long invocationTime = ((System.nanoTime()) - start) / 1000000;
    System.out.println("Invocation returned after: " + invocationTime + " msec");

    // Do some more task
    doSomethingElse();

    Double price = future.get();
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
