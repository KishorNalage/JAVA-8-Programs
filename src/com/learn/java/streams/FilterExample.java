package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    //get all male students
    public static List<Student> getMaleStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents()
                .stream()                                         //Stream<Student>
                .filter(student -> student.getGender().equals("male"))  //Stream<Student> -> filter() use input as predicate to filter out male students
                .collect(Collectors.toList());                   //convert result into list

        return studentList;
    }

    public static void main(String[] args) {
        getMaleStudents().forEach(System.out::println);
    }
}
