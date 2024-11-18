package Test18_Nov_24;

import java.util.Comparator;
import java.util.stream.IntStream;

public class FindLongestSubString {
    public static void main(String[] args) {
        String input = "abacabad";
        String maxLengthSubString= getMaxLengthSubString(input);
        System.out.println("Max Length Substring::"+maxLengthSubString);
    }

    private static String getMaxLengthSubString(String input) {
        String maxLengthString = IntStream.rangeClosed(0, input.length())
                .boxed()
                .flatMap(i -> (IntStream.range(i + 1, input.length() + 1)
                        .mapToObj(j -> input.substring(i, j))))
                .max(Comparator.comparingInt(String::length))
                .get();

        return  maxLengthString;
    }
}
