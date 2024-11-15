package com.learn.java.lambda;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        Predicate<Student> studentPredicate= student -> student.getGpa()>=4.0;
        Predicate<Student> studentPredicate1=student -> student.getGradeLevel()>=3;

        Map<String, List<String>> studentMap =
                studentList
                        .stream()
                        //.peek(student -> System.out.println(student))
                        .filter(studentPredicate)
                        .peek(student -> System.out.println("After 1st Iteration:"+student))
                        .filter(studentPredicate1)
                        .peek(student -> System.out.println("After 2nd Iteration:"+student))
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        studentMap.forEach((name, activities) -> System.out.println(name+"::"+activities) );
    }
}
