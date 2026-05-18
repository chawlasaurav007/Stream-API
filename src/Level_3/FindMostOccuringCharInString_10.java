package Level_3;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMostOccuringCharInString_10 {
    public static void main(String[] args) {
        String s = "banana";
        IntStream chars = s.chars();
        //chars.forEach(System.out::println);//converted to Int Stream just to check thats why i was printing
        // output : 97, 98, 110, 97, 110,97

        // mapToObj(i -> (char) i)
        // Converts IntStream back to Stream<Character>
        //
        // WHY?
        // Because Stream operations like:
        // groupingBy()
        // Function.identity()
        // Collectors.counting()
        //
        // work on objects, not primitive int values
        //
        // IntStream contains primitive int
        // We need Character objects for grouping/counting
        //
        // So:
        // 98 -> 'b'
        // 97 -> 'a'
        // 110 -> 'n'
        Stream<Character> characterStream = chars.mapToObj(i -> (char) i);
        //characterStream.forEach(System.out::println);//Just printing and checking is it converted to stream of char or not
        //output : b a n a n a

        // Finds character having maximum frequency
        //
        // comparingByValue()
        // compares frequency values
        //
        // Output:
        // a=3
        Map<Character, Long> collect = characterStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        // Finds character having maximum frequency
        //
        // comparingByValue()
        // compares frequency values
        //
        // Output:
        // a=3
        //in map we can use stream so we first convert it into stream then do operation
        Map.Entry<Character, Long> characterLongEntry = collect.entrySet().stream()
                                                                    .max(Map.Entry.comparingByValue())
                                                                    .orElseThrow();
        System.out.println(characterLongEntry);
    }

}
