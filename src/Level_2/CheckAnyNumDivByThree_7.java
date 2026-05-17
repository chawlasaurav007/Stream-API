package Level_2;

import java.util.Arrays;
import java.util.List;

public class CheckAnyNumDivByThree_7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 7, 8, 14);
        System.out.println("here we will use anyMatch() method which says if any one condition satisfy it will give true or else false");
        boolean b = list.stream()
                .anyMatch(n -> n % 3 == 0);
        System.out.println(b);
    }
}
