package Level_2;

import java.util.Arrays;
import java.util.List;

public class CountStringStarstsWithA_4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Aman", "Saurav", "Ashish", "Lakshay", "Ayush");
        long a = list.stream()
                .filter(n -> n.startsWith("A"))
                .count();
        System.out.println(a);
    }
}
