package Level_3;

import Level_3.dto.Person;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageAgeOfPerson_2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 28),
                new Person("David", 35)
        );

        OptionalDouble average = people.stream()
                .mapToInt(Person::getAge)
                .average();
        System.out.println(average.getAsDouble());
    }
}
