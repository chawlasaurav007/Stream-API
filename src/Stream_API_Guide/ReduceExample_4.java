package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;

public class ReduceExample_4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer reduce = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
