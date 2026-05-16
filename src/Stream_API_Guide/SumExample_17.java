package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;

public class SumExample_17 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream()
                .mapToInt(i -> i.intValue())
                .sum();
        System.out.println(sum);
    }
}
