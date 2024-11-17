package Test17_Nov_24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMinMaxNumber {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(10,5,20,25,30,2,45,63,16,88,44);
        Optional<Integer> max= getMaxNumber(integers);
        System.out.print("Maximum Number: ");
        System.out.println(max.isPresent()?max.get():"No number found");

        Optional<Integer> min= getMinNumber(integers);
        System.out.print("Minimum Number:");
        System.out.println(min.isPresent()? min.get():"No number found");
    }

    private static Optional<Integer> getMinNumber(List<Integer> integers) {
        Optional<Integer> min = integers.stream()  //Stream<Integer>
                .distinct() //Stream <Integer> ->with distinct() unique values
                .min(Comparator.comparingInt(Integer::intValue));
        return min;
    }

    private static Optional<Integer> getMaxNumber(List<Integer> integers) {
        Optional<Integer> maxNumber = integers.stream() //Stream<Integer>
                .distinct()                             //Stream<Integer> ->distinct()
                .max(Integer::compareTo);               //Optional<Integer> with Integer comparison

        return maxNumber;
    }
}
