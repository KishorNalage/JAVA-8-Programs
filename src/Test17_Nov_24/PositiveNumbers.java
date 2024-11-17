package Test17_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, check if all elements are greater than 0.
public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,-1,0,2,4);
        List<Integer> positiveNumbers = integerList.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());

        System.out.print("Numbers Grater than zero::");
        positiveNumbers.forEach(System.out::println);
    }
}
