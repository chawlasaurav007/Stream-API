package Level_2;

import java.util.Arrays;
import java.util.List;

public class FlattenListOfList_8 {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        System.out.println("So here we use Flatmap to convert it into a single list");
        List<Integer> list1 = list.stream()
                .flatMap(i -> i.stream())
                .toList();
        System.out.println(list1);
    }
}
