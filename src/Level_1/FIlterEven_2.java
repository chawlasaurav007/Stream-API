package Level_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FIlterEven_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();
        stream.filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
