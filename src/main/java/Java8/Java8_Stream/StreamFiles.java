package Java8.Java8_Stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFiles {
	public static void main(String[] args) {

		Path path = Paths.get("src/test/test.txt");
		try (Stream<String> streamOfString = Files.lines(path, Charset.forName("UTF-8"))) {
			streamOfString.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
