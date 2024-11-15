package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void partitioning_1()
    {
        Predicate<Student> studentPredicate= student -> student.getGradeLevel()>=3.9;
        List<Student> allStudents = StudentDataBase.getAllStudents();
        Map<Boolean, List<Student>> map = allStudents.stream()
                .collect(Collectors.partitioningBy(studentPredicate));
        System.out.println(map);
    }

    public static void partitioning_2()
    {
        Predicate<Student> studentPredicate= student -> student.getGradeLevel()>=3.9;
        List<Student> allStudents = StudentDataBase.getAllStudents();
        Map<Boolean, Set<Student>> map = allStudents.stream()
                .collect(Collectors.partitioningBy(studentPredicate,Collectors.toSet()));
        System.out.println(map);
    }
    public static void main(String[] args) {
       //partitioning_1();
       partitioning_2();
    }
}
