package com.learn.java.functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    private static Predicate<Integer> p1= (i)-> i%2==0;
    private static Predicate<Integer> p2= (i)-> i%5==0;

    public static void predicateAnd() {
        System.out.println("Predicate And result is : "+p1.and(p2).test(10)); //predicate chaining
        System.out.println("Predicate And result is : "+p1.and(p2).test(9));
    }

    public static void predicateOr() {
        System.out.println("Predicate Or result is : "+p1.or(p2).test(10)); //predicate chaining
        System.out.println("Predicate Or result is : "+p1.or(p2).test(8));
    }

    public static void predicateNegate() {
        System.out.println("Predicate Negate result is : "+p1.negate().test(10)); //reverse return value
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate= (i)->{return  i%2==0;};
       // System.out.println(predicate.test(10));

       // System.out.println(p2.test(10));
       // predicateAnd();
       // predicateOr();
        predicateNegate();
    }
}
