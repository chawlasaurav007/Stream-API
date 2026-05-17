package Level_3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LenghtOfWordsInSameGroup_4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dog", "apple", "cat", "Mamta", "bat", "saurav", "manisha", "manish");
        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(e -> e.length()));
        System.out.println("simple way of printing the result");
        System.out.println(collect);//{3=[dog, cat, bat], 5=[apple, Mamta], 6=[saurav, manish], 7=[manisha]}

        System.out.println("this is another way of printing the result ");
        collect.forEach((num,occurrences)->{
            System.out.println(num);
            occurrences.forEach(System.out::println);
        });
    }
}
