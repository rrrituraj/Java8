package Java8.Java8_Stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamPrimitives {
	public static void main(String[] args) {
		IntStream range = IntStream.range(1, 5);
		//range.forEach(System.out::println);

		LongStream longStream = LongStream.rangeClosed(1, 6);
//		longStream.forEach(System.out::println);

		Random random = new Random();
		LongStream longs = random.longs(2);
		longs.forEach(System.out::println);
	}
}
