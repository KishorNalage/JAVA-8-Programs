package com.learn.java.streams_terminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class SummingAveringIntCollectorExample {
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        int totalNotebooks = getSumOfNotebooks(studentList);
        System.out.println("total No. of Notebooks"+totalNotebooks);

        double averageOfNotebook= getAverageOfNotebooks(studentList);
        System.out.println("average Of Notebooks:" +averageOfNotebook);
    }


    private static Integer getSumOfNotebooks(List<Student> studentList) {
        Integer totalNotebooks = studentList
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
        return totalNotebooks;
    }
    private static double getAverageOfNotebooks(List<Student> studentList) {
        Double average = studentList.stream().collect(Collectors.averagingInt(Student::getNoteBooks));
        return  average;
    }


}
