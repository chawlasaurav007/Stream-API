package Level_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMax_9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 12, 5, 22, 45,32);
        Optional<Integer> first = list.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst();
        System.out.println("by using sorted way we get max " +first.get());//45

        Integer reduce = list.stream()
                .reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println("by using reduce we get max " + reduce);

        Integer i = list.stream()
                .max(Comparator.naturalOrder()).get();
        System.out.println("by using max() method so max is " + i);
    }
}
