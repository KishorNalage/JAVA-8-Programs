package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

/*FlatMap mainly used for to convert List of streams covert into single stream,
* Ex: If we have student class contains id ,name and List of activities
* we want to get List<Activities> from student list then after map(Student::getActivities)
* we need flatmap to convert List of activities into stream i.e flatMap(List::stream )  */

public class FlatMapExample {

    public  static List<String> getAllActivities()
    {
        List<String> activityList = StudentDataBase.getAllStudents().stream() //Stream <Student>
                .map(Student::getActivities)      //Stream <List<String>
                .flatMap(List::stream)            //Stream <String>
                .collect(Collectors.toList());    //Convert Stream into list

        return activityList;
    }

    public  static List<String> getUniqueActivities()
    {
        List<String> activityList = StudentDataBase.getAllStudents().stream() //Stream <Student>
                .map(Student::getActivities)      //Stream <List<String>
                .flatMap(List::stream)            //Stream <String>
                .distinct()                       //Stream<String> -> distinct() method
                .collect(Collectors.toList());    //Convert Stream into list

        return activityList;
    }
    public  static long countActivities()
    {
        long count = StudentDataBase.getAllStudents().stream() //Stream <Student>
                .map(Student::getActivities)      //Stream <List<String>
                .flatMap(List::stream)            //Stream <String>
                .distinct()                       //Stream<String> -> distinct() method
                .count();                        //long

        return count;
    }

    public  static List<String> getSortedActivities()
    {
        List<String> activityList = StudentDataBase.getAllStudents().stream() //Stream <Student>
                .map(Student::getActivities)      //Stream <List<String>
                .flatMap(List::stream)            //Stream <String>
                .distinct()                       //Stream<String> -> distinct() method
                .sorted()                         //Stream<String> ->sort() method -to sort in natuaral order
                .collect(Collectors.toList());    //Convert Stream into list

        return activityList;
    }

    public static void main(String[] args) {
        System.out.println("AllActivities:"+getAllActivities());
        System.out.println("UniqueActivities:"+getUniqueActivities());
        System.out.println("Count Of Activities:"+countActivities());
        System.out.println("Sorted Activities List:"+getSortedActivities());
    }
}
