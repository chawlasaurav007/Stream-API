package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class PartitionBy_12 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "IT", 4000),
                new Employee("Charlie", "HR", 3500),
                new Employee("Dave", "IT", 4500),
                new Employee("Eve", "Finance", 5000)
        );

        Map<Boolean, List<Employee>> collect = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 3700));
        System.out.println("Simply printing data having salary more than 3700 and less that 3700 but it give two separated thing true or false in one answer");
        System.out.println(collect);

        System.out.println("Now we will print only that data having salary more than 3700");
        collect.get(true).forEach(System.out::println);

        System.out.println("Now we will print only that data having salary less than 3700");
        collect.get(false).forEach(System.out::println);
    }
}
