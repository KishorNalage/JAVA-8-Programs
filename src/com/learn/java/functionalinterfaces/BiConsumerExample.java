package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static  void getNameAndActivities()
    {
        BiConsumer<String,List<String>> biConsumer=(name, activities) -> {
            System.out.println(name+":"+activities);
        };
        List<Student> studentList= StudentDataBase.getAllStudents();

        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));

    }
    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + ", b: " + b);
        };
        //biConsumer.accept("Java7","Java8");

        BiConsumer<Integer,Integer> biConsumerMultiplication=(a,b)->{
            System.out.println("Multiplication:"+ a*b);
        };
       // biConsumerMultiplication.accept(10,5);

        BiConsumer<Integer,Integer> biConsumerDivison=(a,b)->{
            System.out.println("Division :" + a/b);
        };

        //biConsumerMultiplication.andThen(biConsumerDivison).accept(10,5);
         getNameAndActivities();


    }
}
