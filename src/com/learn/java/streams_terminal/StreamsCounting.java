package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsCounting {
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        Long outStr = studentList.stream()                //Stream <Student>
                .map(Student::getName)                      //Stream<String> ->map based on student's name
                .collect(Collectors.counting()); //return all student names with comma seperated
        System.out.println(outStr);
    }
}

//Output: Adam Jenny Emily Dave Sophia James
