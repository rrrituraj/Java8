package Java8.Java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class StreamReductionCollect {
	public static void main(String[] args) {

		List<Product> productList = Arrays.asList(new Product(12, "Potato"),
			new Product(25, "Tomato"),
			new Product(70, "Orange"),
			new Product(20, "Gobhi"),
			new Product(10, "Dhaniya"),
			new Product(30, "Momos"));

		List<String> productNames = productList.stream().map(Product::getName).collect(Collectors.toList());
		productNames.forEach(System.out::println);
		System.out.println(productNames);
		String productNameJoin = productList.stream().map(Product::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(productNameJoin);

		LongSummaryStatistics longSummaryStatistics = productList.stream().collect(Collectors.summarizingLong(Product::getPrice));
		System.out.println(longSummaryStatistics);

	}
}
