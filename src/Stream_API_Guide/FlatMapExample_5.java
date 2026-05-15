package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample_5 {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f"));
        list.stream()
                .flatMap(lists->lists.stream())//so here flatmap also use .stream() to convert inner list elements to stream
                .map(n->n.toUpperCase())
                .forEach(System.out::println);
    }
}
