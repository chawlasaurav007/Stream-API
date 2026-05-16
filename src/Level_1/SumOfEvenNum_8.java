package Level_1;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNum_8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(i -> i.intValue())
                .sum();
        System.out.println("by using .sum() method so sum is " + sum);

        Integer reduce = list.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println("by using .reduce() method so sum is " + reduce);
    }
}
