package Java8.CompletableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest3 {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Beautifull");
    String result = completableFuture.thenApply(s -> s + " World!").get();
    System.out.println(result);

    CompletableFuture<String> completableFuture1 =
        CompletableFuture.supplyAsync(() -> "Buddha Hoga tera");
    completableFuture1.thenAccept(s -> System.out.println(s + " Baap"));
    completableFuture1.get();

    CompletableFuture<String> completableFuture2 =
        CompletableFuture.supplyAsync(() -> "My computation is done::");
    completableFuture2.thenRun(() -> System.out.println("Bro"));
    completableFuture2.get();

    CompletableFuture<String> completableFuture3 =
        CompletableFuture.supplyAsync(() -> "Hello, ")
            .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "World!!"));
    System.out.println(completableFuture3.get());

    CompletableFuture<String> completableFuture4 =
        CompletableFuture.supplyAsync(() -> "Hello, ")
            .thenCombine(CompletableFuture.supplyAsync(() -> "World!!"), (a, b) -> a + b);
    System.out.println(completableFuture4.get());

    CompletableFuture.supplyAsync(() -> "Hello, ")
        .thenAcceptBoth(CompletableFuture.supplyAsync(() -> "World!!"),
            (a, b) -> System.out.println(a + b));

  }
}
