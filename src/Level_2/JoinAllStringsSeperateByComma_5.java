package Level_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAllStringsSeperateByComma_5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Mango", "Orange");
        System.out.println("for joining the strings we will use joining method which is present in Collectors method and inside that we will set the delimiter");
        String collect = list.stream()
                .collect(Collectors.joining(","));
        System.out.println(collect);

    }
}
