package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy_11 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "IT", 4000),
                new Employee("Charlie", "HR", 3500),
                new Employee("Dave", "IT", 4500),
                new Employee("Eve", "Finance", 5000)
        );

        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment()));
        System.out.println("First way of printing this it is very simple");
        System.out.println(collect);//one way to print he output like this

        //another way to print the output like this
        System.out.println("Second way of printing this it is very tricky but it shows clear ");
        collect.forEach((department,empoyeeList)->{
            System.out.println("Department " + department );
            empoyeeList.forEach(System.out::println);
        });
    }
}
