package Stream_API_Guide;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Convert_arr_to_stream_1 {
    public static void main(String[] args) {
        //primitive array
        int primitiveArray[] = {1,2,3,4};
        //converting primitive array to stream we use Arrays.stream() method
        IntStream stream = Arrays.stream(primitiveArray);
        stream.forEach(System.out::println);

        //Object array
        Integer objectArray[] = {5,6,7,8};
        //converting object array to stream we use Stream.of() method
        Stream<Integer> stream2 = Stream.of(objectArray);
        stream2.forEach(System.out::println);

        // When we have a List or any Collection, we can directly convert it into a Stream by using .stream() method
        List<Integer> list = Arrays.asList(9, 10, 11, 12);
        list.stream().forEach(System.out::println);

        // When we have a Set or any Collection, we can directly convert it into a Stream by using .stream() method
        Set<Integer> set = new HashSet<>();
        set.add(13);
        set.add(14);
        set.add(15);
        set.stream().forEach(System.out::println);
    }
}
