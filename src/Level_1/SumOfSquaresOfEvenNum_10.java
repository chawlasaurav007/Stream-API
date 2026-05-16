package Level_1;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEvenNum_10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
