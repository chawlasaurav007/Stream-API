package Level_4;

import Level_3.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstCommonLetterAmongAllEmployee_1 {
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
        //so here we need to find first most common letter among employees so here Alice and Ala are coming 2 times
        //so A is the most common letter in the Employee list

        //so first we will create a stream to get first character of each name in employee list
        Map<Character, Long> collect = employees.stream()
                .map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);//{P=1, A=2, B=1, C=1, D=1, E=1, F=1, J=1}
        Map.Entry<Character, Long> characterLongEntry = collect.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(characterLongEntry);//A=2

        //if you want to merge the stream u can
        Map.Entry<Character, Long> characterLongEntry1 = employees.stream()
                .map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(characterLongEntry1);

    }
}
