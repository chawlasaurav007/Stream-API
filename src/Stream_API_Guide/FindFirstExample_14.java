package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample_14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> first = list.stream()
                .filter(n -> n % 2 == 0) //so it will filter out 2,4,6
                .findFirst();//2 comes first than 2
        System.out.println(first.get());
    }
}
