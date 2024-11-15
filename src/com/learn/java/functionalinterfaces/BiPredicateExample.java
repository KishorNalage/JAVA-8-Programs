package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        BiPredicate<Integer,Double> b1= (gradeLevel, gpa) -> {
            return gradeLevel >= 3 && gpa >= 3.9;
        };

        BiConsumer<String,List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(b1.test(student.getGradeLevel(),student.getGpa()))
            {
                studentBiConsumer.accept(student.getName(),student.getActivities());
            }
        });
    }
}
