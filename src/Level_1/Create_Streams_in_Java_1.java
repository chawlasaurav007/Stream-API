package Level_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Create_Streams_in_Java_1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob");
        //1 : List -> Stream
        Stream<String> stream = names.stream();
        System.out.println(stream);

        String arr[] = {"java","cpp","python"};
        //2 : Array to Stream
        Stream<String> stream1 = Arrays.stream(arr);

        //3 : by using Stream.of() method
        Stream<Integer> integerStream = Stream.of(1, 2, 3);//In Stream.of(1,2,3), these values are primitive
                                                                  // int values and are automatically converted into
                                                                  //Integer objects using autoboxing because Stream
                                                                  // works on objects, not on primitive data types.
                                                                  // so stream.of()method does automatically conversion
                                                                  // primitive to object

        //Stream.generate() is not used much. It is mainly used when we want to create a stream of random or repeated
        // values.
        Stream<Double> limit = Stream.generate(Math::random).limit(5);
        System.out.println("limit "+ limit);
    }
}
