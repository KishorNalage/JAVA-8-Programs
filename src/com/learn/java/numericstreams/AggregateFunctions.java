package com.learn.java.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateFunctions {

    public static void main(String[] args) {
        int sum= IntStream.rangeClosed(1,10).sum();
        System.out.println("Sum of first ten numbers :"+sum);

        OptionalInt max = IntStream.rangeClosed(1, 50).max();
       System.out.println(max.isPresent() ? max.getAsInt() :0);

        OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
        System.out.println(optionalDouble.isPresent()?optionalDouble.getAsDouble() :0);
    }
}
