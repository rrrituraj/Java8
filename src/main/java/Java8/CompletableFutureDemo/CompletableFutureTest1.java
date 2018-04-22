package Java8.CompletableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureTest1 {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    CompletableFuture.runAsync(() -> System.out.println("My task 1 is executing"));
    System.out.println("--------------------------------------");

    CompletableFuture.runAsync(
        () -> {
          System.out.println("My task 2 is running");
        },
        Executors.newFixedThreadPool(3));
    System.out.println("--------------------------------------");
    CompletableFuture<String> async = CompletableFuture.supplyAsync(() -> "Hello world!!!");
    System.out.println("--------------------------------------");
    CompletableFuture<String> async1 =
        CompletableFuture.supplyAsync(() -> "Hello world 2!!!", Executors.newCachedThreadPool());
    System.out.println(async.get() + "   " + async1.get());
    System.out.println("--------------------------------------");
  }
}
