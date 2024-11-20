package Test_20_Nov_22;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String[] args) {
        List<String> inputList= Arrays.asList("kishor","is","my","name");
        List<String> stringList = inputList.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println(stringList);

    }
}
