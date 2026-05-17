package Level_2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverage_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("So when ever it comes to mathematical operations sum, min, max, avg so these will work on primitive Objects so convert it into primitive object");
        System.out.println("so it will not work on Integer object it will work on int object");
        OptionalDouble average = list.stream()
                .mapToInt(n -> n.intValue())
                .average();
        System.out.println(average.getAsDouble());

        System.out.println("Another way" );
        double average1 = list.stream()
                .mapToInt(n -> n.intValue())
                .average()
                .orElse(0.0);
        System.out.println(average1);
    }
}
