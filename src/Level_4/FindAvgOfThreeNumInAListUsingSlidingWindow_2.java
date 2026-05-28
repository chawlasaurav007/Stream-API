package Level_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindAvgOfThreeNumInAListUsingSlidingWindow_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 8, 15, 16, 23, 42);
        //IntStream.range(1, 5)
        //         .forEach(System.out::println);
        // so here IntStream.range(1, 5)
        //is just like for loop from range 1 to 5

        //so i have done this solution which is pretty lengthy solution
        //because suppose if interviewer says i want window size as 4 then
        // u will again do changes like this  list.get(i + 4) and divide by some
        //number and that number also u have to change
        IntStream range = IntStream.range(0, list.size() - 2);
        List<Integer> list3 = range.mapToObj(i -> (list.get(i) + list.get(i + 1) + list.get(i + 2)) / 3).toList();
        System.out.println(list3);

        //so we will do like this only we will give windows size
        //as input and it will calculate for us
        // suppose window size is 3(find sum of 3 num)
        //list.size()-(windows-1) -> 6 - (3-1) = 4
        //so total 4 loop will run

//        What sublist will do here is like this
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        list.subList(0,3);
//        Output : [1,2,3]
//        which means  starts from index 0
//        goes till index 3


        int windows = 4 ;
        List<List<Integer>> list1 = IntStream.range(0, (list.size() - (windows - 1)))
                .mapToObj(i -> list.subList(i, windows + i)).toList();
        System.out.println(list1);//[[4, 8, 15, 16], [8, 15, 16, 23], [15, 16, 23, 42]]

        List<Double> list2 = list1.stream().map(m -> m.stream()//Now stream starts on inner list(list inside list)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0)
        ).toList();

        System.out.println(list2);

    }
}
