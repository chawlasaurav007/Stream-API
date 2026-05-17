package Level_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInAscDesc_3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 4, 5, 1, 2, 5, 6);
        List<Integer> list1 = list.stream()
                .sorted()
                .toList();
        System.out.println("Sort in ascending order "+list1);

        List<Integer> collect = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sort in descending order " + collect);

        System.out.print("And if u want suppose ascending sort and remove duplicates then use distinct ");

        List<Integer> collect1 = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
