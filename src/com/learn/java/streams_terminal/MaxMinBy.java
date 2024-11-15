package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxMinBy {
    public static Optional<Student> maxBy(List<Student> studentList)
    {
        Optional<Student> max = studentList.stream()
                .max(Comparator.comparing(Student::getGpa));
        return max;
    }

    public static Optional<Student> minBy(List<Student> studentList)
    {
        Optional<Student> min = studentList.stream()
                .min(Comparator.comparing(Student::getGpa));
        return min;
    }
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        Optional<Student> student = maxBy(studentList);
        System.out.println(student.isPresent()? student.get(): "No Student Found");

        Optional<Student> minGPAStudent=minBy(studentList);
        System.out.println(minGPAStudent.isPresent());
    }
}
