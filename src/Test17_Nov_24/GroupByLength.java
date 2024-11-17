package Test17_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of strings, group them by their length.
public class GroupByLength {
    public static void main(String[] args) {
        List<String> inputList= Arrays.asList("Kishor","Ramesh","Raju","Prahalad");
        Map<Integer, List<String>> groupByLength = inputList.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupByLength);
    }
}
