package Level_1;

import java.util.Arrays;
import java.util.List;

public class SumAllNum_7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .mapToInt(i -> i.intValue())
                .sum();
        System.out.println("1st way by using sum() so Sum  is " + sum);

        Integer reduce = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("2nd way by using reduce() so Sum  is " + reduce);


        Integer reduce1 = list.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product is " + reduce1);


    }
}
