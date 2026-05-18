package Level_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFirstNonRepeatingChar_11 {
    public static void main(String[] args) {
        String s = "swiss";
        IntStream chars = s.chars();
        Stream<Character> characterStream = chars.mapToObj(i -> (char) i);
        Map<Character, Long> collect = characterStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //And streams can be used on collections like:
        //List
        //Set
        //Map (through entrySet(), keySet(), values())

        //so the problem with this approach is hashmap does not follow insertion order
        //so u may get different result as well
        Map.Entry<Character, Long> characterLongEntry = collect.entrySet().stream()
                .filter(i -> i.getValue() == 1)
                .findFirst()
                .get();
        System.out.println(characterLongEntry);

        // so to get correct result use linked hashmap
        IntStream chars1 = s.chars();
        Stream<Character> characterStream1 = chars1.mapToObj(i -> (char) i);

        //so here we pass the third parameter LinkedHashMap::new
        LinkedHashMap<Character, Long> collect1 = characterStream1.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Map.Entry<Character, Long> characterLongEntry1 = collect1.entrySet().stream()
                .filter(i -> i.getValue() == 1)
                .findFirst()
                .get();
        System.out.println(characterLongEntry1);

    }
}
