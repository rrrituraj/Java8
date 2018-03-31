package Java8.MapInterfaceDefaultMethod;

import Java8.CollectionDefaultMethods.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    public static void main(String[] args) {
        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(10001, new Employee("Rituraj", 30000.00, "Rituraj@gmail.com"));
        empMap.put(10002, new Employee("kamal", 138000.00, "kamal@tcs.com"));
        empMap.put(10003, new Employee("khajju", 50000.0, "khajju@tcs.com"));
        empMap.put(10004, new Employee("yashraj", 5000.00, "yashraj@tcs.com"));
        empMap.put(10005, new Employee("random", 1000000.00, "random@tcs.com"));
        System.out.println(empMap.getOrDefault(100001, new Employee(null, 0.0, null)));

        /*empMap.forEach(new BiConsumer<Integer, Employee>() {
            @Override
            public void accept(Integer integer, Employee employee) {
                System.out.println(integer+"\t"+employee);
            }
        });*/
        empMap.forEach((k, v) -> System.out.println(k + "\t" + v));
    }
}
