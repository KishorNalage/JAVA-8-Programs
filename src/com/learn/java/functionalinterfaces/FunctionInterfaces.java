package com.learn.java.functionalinterfaces;

import java.util.function.Function;

public class FunctionInterfaces {

    public static void main(String[] args) {

        Function<String,String> function= name-> name.toUpperCase();

        System.out.println(function.apply("kishor"));
    }
}
