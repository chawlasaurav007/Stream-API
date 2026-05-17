package Level_3;

import Level_3.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDeptByHighestAvgSalary_9 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1,"John", "IT", 60000),
                new Employee(2,"Alice", "HR", 55000),
                new Employee(3,"Bob", "IT", 75000),
                new Employee(4,"Carol", "HR", 70000),
                new Employee(5,"David", "Finance", 65000),
                new Employee(6,"Eve", "IT", 80000),
                new Employee(7,"Frank", "Finance", 64000),
                new Employee(8,"Prank", "Finance", 67000),
                new Employee(9,"Ala", "Operations", 44000)
        );
        Map<String, Double> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect1);
        Map.Entry<String, Double> stringDoubleEntry = collect1.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(stringDoubleEntry);


    }
}
