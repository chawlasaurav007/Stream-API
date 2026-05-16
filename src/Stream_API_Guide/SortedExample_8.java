package Stream_API_Guide;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample_8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 3, 5, 2, 1);
        System.out.println("sort in ascending order");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("sort in descending order");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        List<String> list1 = Arrays.asList("cherry", "apple", "kiwi", "banana");

        System.out.println("Ascending sort on based of the size or length of the word");

        list1.stream()
                .sorted(Comparator.comparingInt(s->s.length()))
                .forEach(System.out::println);

        System.out.println("Descending sort on based of the size or length of the word");

        list1.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);
    }
}
