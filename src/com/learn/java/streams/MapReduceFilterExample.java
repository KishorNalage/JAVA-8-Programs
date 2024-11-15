package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;

//Get the no. of notebooks of female students whoes grades are greater than or equals to 3
public class MapReduceFilterExample {
    public static void main(String[] args) {
        List<Student> students= StudentDataBase.getAllStudents();
        System.out.println("NumberOfNotebooks:"+getNumberOfNotebooks(students));
    }

    private static int getNumberOfNotebooks(List<Student> students) {

        int noOfBooks  = students.stream()               //Stream <Student>
                .filter(student -> student.getGender().equals("female")) //Stream<Student> -> filter out using predicate gender equal to female
                .filter(student -> student.getGradeLevel()>=3)      //Stream <Student> ->filter out using predicate student gradelevel greater than 3
                .map(Student::getNoteBooks)             //Stream<Integer>
                //.reduce(0, (s1, s2) -> s1 + s2); //sum of notebooks of s1& s2
                .reduce(0,Integer::sum);
        return  noOfBooks;
    }
}
