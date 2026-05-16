package Stream_API_Guide;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample_15 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        boolean b = list.stream()
                .anyMatch(n -> n % 2 == 0);// so from the list if any one condition gets true than it will print true
                                                 // and if it does not find any condition as true that than print false
                                                 //so here as u can see 2,4,6 are 3 even but we want any one number to
                                                 //satisfy the condition to print true so anymatch() works like that
        System.out.println(b);

        System.out.println("Ok suppose it does not satisfy the condition so it will give false");
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        System.out.println(list1.stream()
                .anyMatch(n -> n % 2 == 0));//so here u can see that in anymatch does not satisfy the condition
                                                   //here in the list there is no single element in the list so
                                                   // it gives false

    }
}
