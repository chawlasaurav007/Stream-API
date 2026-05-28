package Level_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTopThreeMostFrequentWordsInSentence_4 {
    public static void main(String[] args) {
        String paragraph = "Java is great. Java is object oriented. Java streams are powerful, powerful and Java is fun!";
        Stream<String> stream = Arrays.stream(
                paragraph.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        );
        //stream.forEach(System.out::println);
        Map<String, Long> collect = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        List<Map.Entry<String, Long>> collect1 = collect.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(3)
                .toList();
        System.out.println(collect1);

    }
}

