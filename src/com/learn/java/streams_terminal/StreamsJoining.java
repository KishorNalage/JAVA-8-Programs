package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJoining {
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        String outStr = studentList.stream()                //Stream <Student>
                .map(Student::getName)                      //Stream<String> ->map based on student's name
                .collect(Collectors.joining(" ")); //return all student names with comma seperated
        System.out.println(outStr);
    }
}

//Output: Adam Jenny Emily Dave Sophia James
