package com.learn.java.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

//Sum of first 10 numbers
public class NumericStreamExample {
    public static void main(String[] args) {
        System.out.println("Sum of First 10 Numbers :"+sumOfNumbers());
    }

    private static int sumOfNumbers() {
       return IntStream.rangeClosed(1,10).sum();
    }
}
