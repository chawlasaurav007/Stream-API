package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;

public class CountExample_16 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        long count = list.stream()
                         .count();
        System.out.println(count);
    }
}
