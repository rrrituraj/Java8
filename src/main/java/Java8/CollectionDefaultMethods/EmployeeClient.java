package Java8.CollectionDefaultMethods;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Rituraj" ,30000.00,"Rituraj@gmail.com"));
        list.add(new Employee("kamal" ,138000.00,"kamal@tcs.com"));
        list.add(new Employee("khajju" ,50000.0,"khajju@tcs.com"));
        list.add(new Employee("yashraj" ,5000.00,"yashraj@tcs.com"));
        list.add(new Employee("random" ,1000000.00,"random@tcs.com"));

        System.out.println(".......................................................................................................................................................................................................");
        list.forEach(System.out::println);
        System.out.println("...........................................................................................................................................................................................................");
        list.sort(EmployeeClient::compare);
        list.forEach(System.out::println);
        System.out.println("...........................................................................................................................................................................................................");
        list.replaceAll(EmployeeClient::salaryIncrement);
        list.forEach(System.out::println);
        System.out.println("...........................................................................................................................................................................................................");

    }

    private static int compare(@NotNull Employee e1, @NotNull Employee e2) {
        return e1.getSalary() < e2.getSalary() ? 1 : -1;
    }

    private static Employee salaryIncrement(Employee employee) {
        if (employee.getSalary() < 50000.00) {
            employee.setSalary(employee.getSalary() + employee.getSalary() * 0.1);
            return employee;
        } else
            return employee;
    }
}
