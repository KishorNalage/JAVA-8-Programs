package com.learn.java.functionalinterfaces;

import java.util.function.BiFunction;

public class BiFunctionInterface {

    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction= (str1, str2)->{
            return  str1.concat(str2);
        };

        System.out.println(biFunction.apply("Kishor","Nalage"));
    }
}
