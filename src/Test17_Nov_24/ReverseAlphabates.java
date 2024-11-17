package Test17_Nov_24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a list of strings, sort them in reverse alphabetical order using Streams.
public class ReverseAlphabates {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("Java","is","a","programming","language");
        List<String> reverseList = stringList.stream()
                .map(s -> s+" ,")
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        reverseList.forEach(System.out::print);
    }
}
