package Java8.ComparatorUsingLambda;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
