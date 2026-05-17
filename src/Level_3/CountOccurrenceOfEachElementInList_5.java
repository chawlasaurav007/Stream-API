package Level_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrenceOfEachElementInList_5 {
    public static void main(String[] args) {
        //You are grouping each fruit name and counting how many times it occurs in the list.
        //Function.identity() means → “use the same fruit name as the key which is in the list.”
        //Collectors.counting() means → “count how many times each fruit appears.”
        //so here key are fruits and there count is value
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));//use this like a key-value
                 //key-Collectors.groupingBy(Function.identity() and value - Collectors.counting()
        System.out.println(collect);//{orange=1, banana=2, apple=3}


    }
}
