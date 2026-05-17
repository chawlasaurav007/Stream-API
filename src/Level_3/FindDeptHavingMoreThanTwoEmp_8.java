package Level_3;

import Level_3.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDeptHavingMoreThanTwoEmp_8 {
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

        System.out.println("this is my way of doing the solution : ");
        Map<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect);//{Finance=2, HR=2, IT=3, Operations=1}
        collect.forEach((department,counting)->{
            if(counting>2){
                System.out.println(department);
            }
        });

        System.out.println("Another way of solving this is ");
        Map<String, Long> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        List<Map.Entry<String, Long>> list = collect1.entrySet()// converts map into Set of key-value pairs key = department & value = employee count in that department(.entrySet() will converts map into key-value pairs)
                .stream()//we use again stream because further operation(ex like filter) will be used on streams not on map so thats why we convert map again to stream
                .filter(e -> e.getValue() > 2)
                .toList();
        System.out.println(list);//[Finance=3, IT=3]

        System.out.println("if u want u can club the streams and if u want u can get the department name only having employee greater than 2 ");
        List<String> list1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 2)
                .map(e -> e.getKey())
                .toList();
        System.out.println(list1);
    }
}
