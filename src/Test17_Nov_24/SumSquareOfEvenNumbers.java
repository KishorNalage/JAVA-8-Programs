package Test17_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, calculate the sum of squares of only the even numbers using Streams.
public class SumSquareOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,5,6,7,8);
        int sum = integerList.stream()
                .filter(no->no%2==0)
                .mapToInt(no -> no * no)
                .sum();

        System.out.println("Sum ::"+sum);
    }
}
