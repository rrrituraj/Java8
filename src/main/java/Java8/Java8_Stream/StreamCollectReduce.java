package Java8.Java8_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectReduce {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("sean");
		list.add("frank");
		list.add("martin");

		List<String> stringList = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		stringList.forEach(System.out::println);
	}
}
