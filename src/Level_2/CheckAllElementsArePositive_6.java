package Level_2;

import java.util.Arrays;
import java.util.List;

public class CheckAllElementsArePositive_6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 23, 2, 4, 56);
        System.out.println("So here we will use .allMatch() method which says all the condition should be satisfied so it will give true or else false ");
        boolean b = list.stream()
                .allMatch(n -> n > 0);
        System.out.println("Are all numbers are positive = " + b);
    }
}
