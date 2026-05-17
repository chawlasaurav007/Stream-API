package Level_2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates_1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 4, 3, 2, 1, 5);
        System.out.println("removing duplicates by using distinct() " );
        list.stream()
                .distinct()
                .toList()
                .forEach(System.out::println);//1,2,3,4,5

        System.out.println("we can use set, and set keeps unique value");
        Set<Integer> collect = list.stream()
                .collect(Collectors.toSet());
        System.out.println(collect);//[1, 2, 3, 4, 5]
    }

}
