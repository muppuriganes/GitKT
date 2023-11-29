import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}

public class Ex4 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 30, "IT"));
        employees.add(new Employee("Jane Smith", 28, "HR"));
        employees.add(new Employee("Tom Wilson", 35, "Finance"));
        employees.add(new Employee("Emily Johnson", 27, "IT"));
        employees.add(new Employee("Michael Brown", 32, "Operations"));

        // Using Streams and Optional to print employee details
        employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .findFirst()
                .ifPresent(employee -> {
                    System.out.println("Employee Details:");
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Age: " + employee.getAge());
                    System.out.println("Department: " + employee.getDepartment());
                });

        // Retrieving a non-existent employee using Optional
        Optional<Employee> nonExistentEmployee = employees.stream()
                .filter(employee -> employee.getDepartment().equals("Sales"))
                .findFirst();

        if (nonExistentEmployee.isPresent()) {
            Employee employee = nonExistentEmployee.get();
            System.out.println("Employee Found:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Department: " + employee.getDepartment());
        } else {
            System.out.println("Employee in Sales department not found.");
        }
    }
}
