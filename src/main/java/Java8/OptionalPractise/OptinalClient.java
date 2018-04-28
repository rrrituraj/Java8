package Java8.OptionalPractise;

import java.util.Optional;
import java.util.function.Function;

public class OptinalClient {
    public static void main(String[] args) {

        Function<String, String> getSecondWord =
                (s) -> s.split(" ").length > 1 ? s.split(" ")[1] : null;

        Function<String, Integer> getLetterCount = t -> t.length();

    /*Integer count=getSecondWord.andThen(getLetterCount).apply("Rituraj Gupta");
    System.out.println(count);*/

        Optional.ofNullable(getSecondWord.apply("Rituraj")).map(getLetterCount).orElse(1);
    }
}
