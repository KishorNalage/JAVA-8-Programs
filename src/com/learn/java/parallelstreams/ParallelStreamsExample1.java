package com.learn.java.parallelstreams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsExample1 {
    public static List<String> sequentialPrintActivities()
    {
        long startTime=System.currentTimeMillis();
        List<String> stringList = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime=System.currentTimeMillis();
        System.out.println("Duration to execute pipeline in sequential :"+(endTime-startTime));
       return  stringList;
    }
    public static List<String> parallelPrintActivities()
    {
        long startTime=System.currentTimeMillis();
        List<String> stringList = StudentDataBase.getAllStudents().parallelStream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime=System.currentTimeMillis();
        System.out.println("Duration to execute pipeline in parallel :"+(endTime-startTime));
        return  stringList;
    }
    public static void main(String[] args) {
        sequentialPrintActivities();
        parallelPrintActivities();
    }
}
