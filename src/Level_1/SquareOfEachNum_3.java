package Level_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEachNum_3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
