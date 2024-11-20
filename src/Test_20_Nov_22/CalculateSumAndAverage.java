package Test_20_Nov_22;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Long.sum;

public class CalculateSumAndAverage {
    public static void main(String[] args) {
        int[] inputArray= {1,2,3,4,5,6,7,8};

        int sum = getSum(inputArray);
        System.out.println("sum::"+sum);

        double average=getAverage(inputArray);
        System.out.println("average::"+average);

    }

    private static int getSum(int[] inputArray) {
        return Arrays.asList(inputArray)
                .stream()
                .flatMapToInt(Arrays::stream)
                .sum();
    }
    private static double getAverage(int[] inputArray) {
        return  Arrays.asList(inputArray)
                .stream()
                .flatMapToInt(Arrays::stream)
                .average()
                .getAsDouble();

    }
}
