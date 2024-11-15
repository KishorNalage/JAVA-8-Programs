package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static List<String> getStudentsName()
    {
        List<Student> studentList= StudentDataBase.getAllStudents();
        List<String> studentNameList = studentList.stream() //Stream<Student>
                .map(Student::getName)  //Stream <String>  : Student's Name
                .map(String::toUpperCase) // Stream<String> -> Stream<String's in uppercase>
                .collect(Collectors.toList()); //Convert stream into list

        return studentNameList;
    }

    public static Set<String> getStudentsNameSet()
    {
        List<Student> studentList= StudentDataBase.getAllStudents();
        Set<String> studentNameList = studentList.stream() //Stream<Student>
                .map(Student::getName)  //Stream <String>  : Student's Name
                .map(String::toUpperCase) // Stream<String> -> Stream<String's in uppercase>
                .collect(Collectors.toSet()); //Convert stream into list

        return studentNameList;
    }
    public static void main(String[] args) {
        System.out.println(getStudentsName());
        System.out.println(getStudentsNameSet());
    }
}
