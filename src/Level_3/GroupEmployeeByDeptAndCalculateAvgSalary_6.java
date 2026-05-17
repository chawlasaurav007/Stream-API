package Level_3;

import Level_3.dto.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class GroupEmployeeByDeptAndCalculateAvgSalary_6 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000)
        );
        System.out.println("Through this way i solved ");
        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        collect.forEach((department,salary)->{
            System.out.println(department);
            System.out.println(salary.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
        });

        System.out.println("or we can do like this as well : ");

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((department,salary)->{
                    System.out.println(department);
                    System.out.println(salary.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
                });

        System.out.println("and there is a simple way as well no need to write so much of code : " );
        Map<String, Double> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(i->i.getSalary())));
        // use it like a key-value
        //key - Collectors.groupingBy(Employee::getDepartment
        //value - Collectors.averagingDouble(i->i.getSalary()
        System.out.println(collect1);
    }

}
