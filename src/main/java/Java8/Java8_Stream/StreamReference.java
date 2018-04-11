package Java8.Java8_Stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReference {
	public static void main(String[] args) {
		/*Stream<String> stringStream = Stream.of("a", "b", "c").filter(e -> e.contains("b"));
		Optional<String> any = stringStream.findAny();
		System.out.println(any.get());

		Optional<String> first = stringStream.findFirst();
		System.out.println(first.get());*/
		List<String> stringStream = Stream.of("a", "b", "c").filter(e -> e.contains("b")).collect(Collectors.toList());
		Optional<String> any = stringStream.stream().findAny();
		System.out.println(any.get());

		Optional<String> first = stringStream.stream().findFirst();
		System.out.println(first.get());

	}
}
