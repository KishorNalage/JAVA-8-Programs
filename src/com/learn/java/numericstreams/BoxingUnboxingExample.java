package com.learn.java.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxingExample {
    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1,10) //Stream<Integer>
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }
    public static int unBoxing(List<Integer>  integer)
    {
        int sum = integer.stream()
                //Integer
                .mapToInt(Integer::intValue).sum();//Convert to int
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(boxing());
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(unBoxing(integerList));
    }
}
