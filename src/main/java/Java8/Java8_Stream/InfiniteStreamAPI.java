package Java8.Java8_Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamAPI {
	public static void main(String[] args) {
		Stream<Integer> infiniteInteger = Stream.iterate(2, i -> i + 2);
		List<Integer> list = infiniteInteger.limit(10).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
