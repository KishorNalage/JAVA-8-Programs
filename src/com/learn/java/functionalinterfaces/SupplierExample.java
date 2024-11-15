package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Student> studentSupplier=()->{
           return new Student("Adam",2,3.6, "male",10,
                   Arrays.asList("swimming", "basketball","volleyball"));
        };

        System.out.println(studentSupplier.get());
    }
}
