package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    Predicate<Student> p1= student -> student.getGradeLevel()>=3;
    Predicate<Student> p2= student -> student.getGpa()>=3.9;

    BiConsumer<String,List<String>> biConsumer= (name, activities) -> {
        System.out.println(name+" : "+activities);
    };

    Consumer<Student> studentConsumer=student -> {
        if(p1.and(p2).test(student))
            biConsumer.accept(student.getName(),student.getActivities());

    };
    private  void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }


    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }


}
