package Java8.CollectionDefaultMethods;

import java.util.Objects;

public class Employee {
    private  String name;
    private  double  salary;
    private  String email;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
    public Employee(String name, double salary, String email) {
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

}
