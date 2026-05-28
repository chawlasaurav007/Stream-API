package Level_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class FindLongestWordInSentenceIgnorePunctuation_3 {
    public static void main(String[] args) {
        String s = "Saurav, is a good boy!";

        //this regular expression says "[^a-z\s]"
        // Removes special characters and keeps only letters and spaces
        String s1 = Arrays.stream(
                        s.toLowerCase()
                                .replaceAll("[^a-z\\s]", "")
                                .split(" ")
                )
                .max(Comparator.comparing(String::length))
                .orElse("");
        System.out.println(s1);

        //this is another way of solving this
        String longestWord = Arrays.stream(s.split("\\s+"))
                .map(word -> word.replaceAll("[^a-zA-Z]", ""))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(longestWord);

        //without using regular expression

        String longestWord1 = Arrays.stream(s.split(" "))
                .map(word -> {
                    StringBuilder sb = new StringBuilder();
                    for (char ch : word.toCharArray()) {
                        if (Character.isLetter(ch)) {//it will add word by word and will ignore(,!) like this "Saurav," -> "Saurav"
                            sb.append(ch);
                        }
                    }
                    return sb.toString();
                })
                .max(Comparator.comparingInt(String::length))
                .orElse(""); System.out.println(longestWord);
        System.out.println(longestWord1);

    }
}
