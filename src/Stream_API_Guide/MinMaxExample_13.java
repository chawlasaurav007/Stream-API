package Stream_API_Guide;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample_13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Minimum number from the list ");
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());

        System.out.println("Maximum number from the list ");
        Integer i = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(i);
    }
}
