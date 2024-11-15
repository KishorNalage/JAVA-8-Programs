package com.learn.java.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream intStream=IntStream.range(1,50);
        System.out.println("IntStream range count :"+intStream.count());
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));

        System.out.println("\n IntStream rangeClosed count :"+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));

        System.out.println("\n LongStream range count :"+LongStream.range(1,50).count());
        LongStream.range(1,50).forEach(value -> System.out.print(value+","));

        System.out.println("\n LongStream rangeClosed count :"+ LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));

        System.out.println("IntStream range count :"+intStream.asDoubleStream().count());
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));

        System.out.println("\n IntStream rangeClosed count :"+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));


    }
}
