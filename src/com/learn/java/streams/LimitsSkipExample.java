package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitsSkipExample {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(4,6,8,10,12,14,18,20);

       Optional<Integer> sum= getSumOfFirstFiveElements(integers);
       if(sum.isPresent())
           System.out.println("Sum of first five elements:"+sum.get());
       else System.out.println("no sum found");

        Optional<Integer> sumofLast= getSumOfLastFiveElements(integers);
        if(sumofLast.isPresent())
            System.out.println("Sum of first five elements:"+sumofLast.get());
        else System.out.println("no sum found");
    }

    private static Optional<Integer> getSumOfFirstFiveElements(List<Integer> integers) {
        return integers.stream()
                .limit(5)
                .reduce(Integer::sum);
    }

    private static Optional<Integer> getSumOfLastFiveElements(List<Integer> integers) {
        return integers.stream()
                .skip(5)
                .reduce(Integer::sum);
    }
}
