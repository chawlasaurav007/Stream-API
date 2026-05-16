package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample_9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listAfterSkip = list.stream()
                .skip(2)//so here first two elements will be skipped which is 1,2
                .collect(Collectors.toList());
        System.out.println(listAfterSkip);
    }
}
