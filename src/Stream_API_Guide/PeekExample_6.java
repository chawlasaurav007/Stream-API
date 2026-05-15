package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample_6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = list.stream()
                .map(n -> n * n)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
