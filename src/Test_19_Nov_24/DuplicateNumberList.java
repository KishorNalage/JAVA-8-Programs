package Test_19_Nov_24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//How do you extract duplicate elements from an array? )
//I/P : [111, 222, 333, 111, 555, 333, 777, 222}      O/P: [111, 333, 222]
public class DuplicateNumberList {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        List<Integer> duplicateNumberList= getDuplicateNumberList(listOfIntegers);
        System.out.println(duplicateNumberList);
    }

    private static List<Integer> getDuplicateNumberList(List<Integer> listOfIntegers) {
        HashSet<Integer> hashSet= new HashSet<>();
        List<Integer> list= listOfIntegers.stream()  //Stream<Integer>
                .filter(no-> !(hashSet.add(no)))     //Stream<Integer> ->filter() using predicate number not need to add in hashset
                .collect(Collectors.toList());       //Stream<Integer> using collect() convert into list

        return  list;
    }

}
