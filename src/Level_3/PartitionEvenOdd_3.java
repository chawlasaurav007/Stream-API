package Level_3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd_3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even Num : " + collect.get(true));
        System.out.println("Odd Num : " + collect.get(false));

    }
}
