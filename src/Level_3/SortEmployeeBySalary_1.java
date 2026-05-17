package Level_3;

import Level_3.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary_1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000)
        );

        List<Employee> list = employees.stream()
                .sorted(Comparator.comparing(n -> n.getSalary()))
                .toList();
        System.out.println("Sort in ascending order based on salary : ");
        System.out.println(list);


        List<Employee> list1 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println("Sort in descending order based on salary : ");
        System.out.println(list1);
    }
}
