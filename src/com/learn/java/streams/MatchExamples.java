package com.learn.java.streams;

import com.learn.java.data.StudentDataBase;

public class MatchExamples {
    public static  boolean matchAll()
    {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }
    public static  boolean anyMatch()
    {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=4.1);
    }

    public static  boolean nonMatch()
    {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=4.1);
    }
    public static void main(String[] args) {
        System.out.println("Student  allMatch ::"+matchAll());
        System.out.println("Student  anyMatch ::"+anyMatch());
        System.out.println("Student  nonMatch ::"+nonMatch());
    }
}
