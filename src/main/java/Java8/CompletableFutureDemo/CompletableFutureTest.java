package Java8.CompletableFutureDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureTest {


  public static void main(String[] args) {
    CompletableFuture<String> future = calculateAsync();
    try {
      String result = future.get();
      System.out.println(result);
      System.out.println(Thread.currentThread().getName());
      System.out.println("-------------------------------------------------------------");
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

  }

  public static CompletableFuture<String> calculateAsync() {
    CompletableFuture<String> completableFuture = new CompletableFuture<>();

    List<String> list = new ArrayList();
    list.add("RR");
    list.add("RJ");
    list.add("KJ");

    Executors.newCachedThreadPool().submit(() -> {
      try {
        Thread.sleep(20);
        String joinStr = String.join(",", list);
        System.out.println(Thread.currentThread().getName());
        completableFuture.complete(joinStr);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return null;
    });
    return completableFuture;
  }

}
