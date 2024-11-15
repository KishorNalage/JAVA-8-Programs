package com.learn.java.functionalinterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1= student -> student.getGradeLevel()>=3;
    static Predicate<Student> p2= student -> student.getGpa()>=3;
    public static void main(String[] args) {
    //   filterStudentGradeLevel();
     //  filterStudentGPA();
       //filterStudentGradeLevelAndGPA();
       // filterStudentGradeLevelOrGPA();
        filterStudentNegateGradeLevel();
    }

    private static void filterStudentNegateGradeLevel() {
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student->
        {
            if(p1.negate().test(student))
                System.out.println(student);
        });
    }

    private static void filterStudentGradeLevelOrGPA() {
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student->
        {
            if(p1.or(p2).test(student))
                System.out.println(student);
        });
    }

    private static void filterStudentGradeLevelAndGPA() {
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student->
        {
            if(p1.and(p2).test(student))
                System.out.println(student);
        });
    }

    private static void filterStudentGPA() {
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student->
        {
            if(p2.test(student))
                System.out.println(student);
        });
    }

    private static void filterStudentGradeLevel() {
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student->
        {
            if(p1.test(student))
                System.out.println(student);
        });
    }
}
