package Level_2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFIrstNonEmptyStringInList_9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("", "", "", "Hello", "", "Saurav","");
        System.out.println("by using .length() method");
        Optional<String> first = list.stream()
                .filter(n -> n.length() != 0)
                .findFirst();
        System.out.println(first.get());

        System.out.println("this is another way by using .isEmpty() method");
        String s = list.stream()
                .filter(n -> !n.isEmpty())
                .findFirst().get();
        System.out.println(s);

    }
}
