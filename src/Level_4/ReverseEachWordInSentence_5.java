package Level_4;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseEachWordInSentence_5 {
    public static void main(String[] args) {
        String s = "Saurav is a good boy";
        Arrays.stream(s.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .forEach(System.out::println);

        //another way by joining
        String collect = Arrays.stream(s.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(collect);

        //without using inbuilt method reverse
        String result = Arrays.stream(s.split(" "))
                .map(word ->
                        Arrays.stream(word.split(""))
                                .reduce("", (rev, ch) -> ch + rev)
                )
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
