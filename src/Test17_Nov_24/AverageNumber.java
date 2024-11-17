package Test17_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find the average of the numbers using the Stream API.
public class AverageNumber {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,3,4,6,18,20);

        double averageNo = integerList.stream()
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println("Average Number:"+averageNo);
    }
}
