package Level_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEvenNum_4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();//in recent version of java we can use toList() as well
        System.out.println(collect);
    }
}
