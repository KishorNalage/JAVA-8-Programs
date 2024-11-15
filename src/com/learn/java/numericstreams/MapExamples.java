package com.learn.java.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExamples {
    public static List<Integer> maptoObj()
    {
        List<Integer> integerList=IntStream.rangeClosed(0,5).mapToObj(value -> {
            return Integer.valueOf(value);
        }).collect(Collectors.toList());

        return integerList;
    }

    public static Long maptoLong()
    {
        long sum =IntStream.rangeClosed(0,5).mapToLong((i) -> i).sum();

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(maptoObj());
        System.out.println(maptoLong());
    }
}
