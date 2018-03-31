package Java8.ComparatorUsingLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class StudentClient {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("kamal", 25, "second"));
        list.add(new Student("raju", 24, "first"));
        list.add(new Student("ahajju", 24, "first"));
        System.out.println("Before sort");
        list.forEach(System.out::println);
        Collections.sort(list, (s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        System.out.println("After sort");
        list.forEach(System.out::println);

        list.removeIf((student)->  student.getS_class().equalsIgnoreCase("first"));
        System.out.println("After removeif");
        list.forEach(System.out::println);
    }
}