package Level_1;

import java.util.Arrays;
import java.util.List;

public class NumbersGreaterThanFive_6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 6, 8, 3, 4, 8);
        long count = list.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count);//3
    }
}
