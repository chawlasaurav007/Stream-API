package Level_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNum_10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 6, 8,8, 6, 1);
        Integer i = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst().get();
        System.out.println(i);
    }
}
