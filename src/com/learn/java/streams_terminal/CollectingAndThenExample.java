package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectingAndThenExample {
    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        Map<Integer, Student> map = allStudents.stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen
                                (Collectors.maxBy(
                                Comparator.comparing(Student::getGpa)),
                                        Optional::get)));

        map.forEach((k,v)-> System.out.println(k+"::"+v));

    }
}
