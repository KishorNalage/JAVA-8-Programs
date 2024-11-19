package Test_19_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How do you remove duplicate elements from a list using Java 8 streams
public class RemoveDuplicates {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueList = removeDuplicates(listOfStrings);
        System.out.println(uniqueList);
    }
    private static List<String> removeDuplicates(List<String> listOfStrings) {
        List<String> list=listOfStrings.stream() //Stream<String>
                .map(s->s.toLowerCase())         //Stream<String> ->map() used function to apply()  string to lowercase
                .distinct()                      //Stream<String> ->distinct() (unique strings)
                .collect(Collectors.toList());   //List<String> -> Collect() Terminal Operation to convert streams into list
        return list;
    }
}
