package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinMaxValueOptional {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(5,10,15,20);
        Optional<Integer> maxValue =getMaxValue(integers);
        if(maxValue.isPresent())
            System.out.println("Max value::"+maxValue.get());
        else System.out.println("No max value ");

        Optional<Integer> minValue =getMinValue(integers);
        if(minValue.isPresent())
            System.out.println("Min value::"+minValue.get());
        else System.out.println("No min value ");
    }

    private static Optional<Integer> getMaxValue(List<Integer> integers) {
        Optional<Integer> max = integers.stream() //Stream<Integer>
                //.reduce(Integer::max);            //reduce check each integer & return max value
                .reduce((a,b)-> a>b?a:b);

        return max;
    }

    private static Optional<Integer> getMinValue(List<Integer> integers) {
        Optional<Integer> min = integers.stream() //Stream<Integer>
                //.reduce(Integer::min);            //reduce check each integer & return max value
                .reduce((a,b)-> a<b ? a:b);

        return min;
    }
}
