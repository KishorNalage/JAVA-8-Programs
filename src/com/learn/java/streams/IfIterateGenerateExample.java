package com.learn.java.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class IfIterateGenerateExample {
    public static void main(String[] args) {
        Stream<String > input=Stream.of("adam","dan","joule");
        input.forEach(System.out::println);

        Stream.iterate(1,x->x*2)
                .limit(10)
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier= new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(10)
                .forEach(System.out::println);
    }
}
