package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;

public class LimitExample_10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                .limit(3)//so here max size is limited upto 3 so limit is 3
                .forEach(System.out::println);
    }
}
