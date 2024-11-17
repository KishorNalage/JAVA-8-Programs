package Test17_Nov_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of lists of integers, flatten them into a single list using Streams.
public class FlattenedString {
    public static void main(String[] args) {
        List<List<Integer>> inputList= Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7),
                Arrays.asList(8,9,10)
        );
        List<Integer> flattenedList = inputList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);
    }


}
