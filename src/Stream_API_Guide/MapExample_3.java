package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;

public class MapExample_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("saurav", "manish", "manisha");
        list.stream().map(names->names.toUpperCase()).forEach(System.out::println);
    }
}
