package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample_7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 3, 4, 5);
        list.stream()
                .distinct()
                .forEach(System.out::println);
        List<Integer> collect = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
