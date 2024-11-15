package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class FindAllFirstExample {
    private static Optional<Student> findAny()
    {
        return  StudentDataBase.getAllStudents().parallelStream()       //Stream<Student>
                .filter(student -> student.getGpa()>=4.0) //Stream<Student> ->filter() with predicate student's gpa>=2.5
                .findAny();
    }

    private static Optional<Student> findFirst()
    {
        return  StudentDataBase.getAllStudents().parallelStream()        //Stream<Student>
                .filter(student -> student.getGpa()>=4.0) //Stream<Student> ->filter() with predicate student's gpa>=2.5
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> student= findAny();
        if(student.isPresent())
            System.out.println("FindAny :"+student.get());
        else
            System.out.println("No Student found");

        Optional<Student> firstStudent=findFirst();
        if(findFirst().isPresent())
            System.out.println("First Student :"+firstStudent.get());
        else
            System.out.println("No student found");
    }
}
