package Test17_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Given a list of integers, find the first number greater than 5 using Stream API.
public class FindFirstNumberGreaterThanFive {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(2,4,4,8,6,7,3,6,7,9);

        Optional<Integer> first = getFirstNumberGraterThanFive(integerList);
        System.out.print("First Number Greater Than Five:");
        System.out.println(first.isPresent()?first.get():"No number found greater than 5 ");

    }

    private static Optional<Integer> getFirstNumberGraterThanFive(List<Integer> integerList) {
        Optional<Integer> first = integerList.stream()
                .filter(num -> num > 5)
                .findFirst();
        return first;
    }
}
