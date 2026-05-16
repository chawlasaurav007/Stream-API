package Level_1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumGreaterThanTen_5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 12, 7,11, 24);
        Integer i = list.stream()
                .filter(n -> n > 10)
                .findFirst()
                .get();
        System.out.println(i);//12

        System.out.println("suppose u need according to the smaller number so output should be 11");

        Optional<Integer> first = list.stream()
                .filter(n -> n > 10)
                .sorted()
                .findFirst();
        System.out.println(first.get());//11

    }
}
