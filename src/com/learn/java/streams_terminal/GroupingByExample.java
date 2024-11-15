package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        Map<Double, List<Student>> gpaMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGpa, LinkedHashMap::new,Collectors.toList()));

        gpaMap.forEach((k,v)-> System.out.println(k+"::"+v));

    }
}
