package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    //Sort Student based on there names
    public static List<Student> getSortedStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents()
                .stream()                                         //Stream<Student>
                .sorted(Comparator.comparing(Student::getName))  //Stream<Student> -> sort() in natural order
                .collect(Collectors.toList());                   //convert result into list

        return studentList;
    }

    //Sort Student based on there names desending
    public static List<Student> getSortedStudentsDescending() {
        List<Student> studentList = StudentDataBase.getAllStudents()
                .stream()                                         //Stream<Student>
                .sorted(Comparator.comparing(Student::getName).reversed())  //Stream<Student> -> sort() in descending
                .collect(Collectors.toList());                   //convert result into list

        return studentList;
    }

    public static void main(String[] args) {
        System.out.println("Natural Sorting");
        getSortedStudents().forEach(System.out::println);
        System.out.println("Descending Sorting");
        getSortedStudentsDescending().forEach(System.out::println);

    }
}
