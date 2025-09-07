import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class FindMaxSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 50000),
            new Employee("Bob", 70000),
            new Employee("Charlie", 60000)
        );

        Employee highestPaid = employees.stream()
                                        .max(Comparator.comparingInt(Employee::getSalary))
                                       .orElseThrow(() -> new NoSuchElementException("No employees found"));

        System.out.println("Highest paid employee: " + highestPaid.getName() + " with salary: " + highestPaid.getSalary());
    }
}
