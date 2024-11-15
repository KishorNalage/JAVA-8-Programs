package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
       List<Integer> integers= Arrays.asList(2,5,7,8);
        System.out.println("Total Multiplication:"+ performMultiplication(integers));
        System.out.println("Total Multiplication without Identity:"+ performMultiplicationWithoutIdentity(integers).get());
        Optional<Student> optionalStudent=highestGradeStudent();
        if(optionalStudent.isPresent())
            System.out.println("Highest GPA Student ::"+optionalStudent.get());
    }

    private static int performMultiplication(List<Integer> integers) {
        int multiplication = integers.stream() //stream<Integer>
                //2
                //5
                //7
                //8
                //a=1, b=2 return 2 (first starts from identity here is 1)
                //a=2 b=5  return 10
                //a=10 b=7  return 70
                //a=70 b=8  return 560
                .reduce(1, (a, b) -> a * b); //
        return multiplication;
    }
    private static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {
        Optional<Integer> multiplication = integers.stream() //stream<Integer>
                //2
                //5
                //7
                //8
                .reduce( (a, b) -> a * b); //
        return multiplication;
    }

    private static Optional<Student> highestGradeStudent()
    {
        Optional<Student> maxGpaStudent = StudentDataBase.getAllStudents().stream()
                // check students gpa each time and return highest GPS's student
                .reduce((s1, s2) -> s1.getGpa()> s2.getGpa() ?s1 :s2);
                /*  .reduce((s1, s2) -> {
                if (s1.getGpa() > s2.getGpa())
                    return s1;
                else return s2;
                    });*/
        return  maxGpaStudent;
    }
}
