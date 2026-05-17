package Level_3;

import Level_3.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmployeeInEachDept_7 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000)
        );

        System.out.println("Highest Salary of each department  : ");
        System.out.println("the way i know ");
        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        collect.forEach((department,highestPaid)->{
            System.out.println(department);
            System.out.println(highestPaid.stream().mapToDouble(Employee::getSalary).max().getAsDouble());
        });

        System.out.println("Highest Salary of each department  : ");
        System.out.println("If u want u can club both the streams : " );
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((dept,highestPaid)->{
                System.out.println(dept);
                System.out.println(highestPaid.stream().mapToDouble(Employee::getSalary).max().getAsDouble());
        });

        System.out.println("Employee Name having Highest Salary of each department  : ");

        Map<String, Optional<Employee>> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(collect1);

    }
}
