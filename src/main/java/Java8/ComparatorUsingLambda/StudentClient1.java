package Java8.ComparatorUsingLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentClient1 {

  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("kamal", 25, "second"));
    list.add(new Student("raju", 24, "first"));
    list.add(new Student("ahajju", 24, "first"));
    Comparator<Student> studentComparator = Comparator.comparing(Student::getName);
    Collections.sort(list, studentComparator);
    list.forEach(System.out::println);
  }
}
