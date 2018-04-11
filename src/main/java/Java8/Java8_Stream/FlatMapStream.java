package Java8.Java8_Stream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapStream {
	public static void main(String[] args) {
		List<String> uris = new ArrayList<>();
		uris.add("C:\\Myfile1.txtx");
		uris.add("C:\\Myfile2.txtx");
		uris.add("H:\\Myfile3.txtx");
		uris.add("D:\\Myfile4.txtx");

		Stream<Path> map = uris.stream().map(uri -> Paths.get(uri));
		map.forEach(System.out::println);

		List<String> parts1 = new ArrayList<>();
		parts1.add("Parts11");
		parts1.add("Parts12");
		parts1.add("Parts13");
		parts1.add("Parts14");

		List<String> parts2 = new ArrayList<>();
		parts2.add("Parts21");
		parts2.add("Parts22");
		parts2.add("Parts23");
		parts2.add("Parts24");
		parts2.add("Parts25");

		Detail details1 = new Detail(1001, parts1);
		Detail details2 = new Detail(1002, parts2);

		List<Detail> detail = new ArrayList<>();
		detail.add(details1);
		detail.add(details2);

		Stream<String> flatmap = detail.stream().flatMap(detail1 -> detail1.getList().stream());
		flatmap.forEach(System.out::println);

	}
}
