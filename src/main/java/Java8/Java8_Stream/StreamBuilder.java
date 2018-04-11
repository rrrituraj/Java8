package Java8.Java8_Stream;

import java.util.stream.Stream;

public class StreamBuilder {
	public static void main(String[] args) {
		Stream<String> build = Stream.<String>builder().add("a").add("v").add("c").build();
		build.forEach(System.out::println);
		System.out.println(build);


	}
}
