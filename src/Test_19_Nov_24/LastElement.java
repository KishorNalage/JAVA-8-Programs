package Test_19_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//How do you get last element of an array?
public class LastElement {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        Optional<String> lastElement=listOfStrings.stream()
                .skip(listOfStrings.size()-1)
                .distinct()
                .findFirst();
        System.out.print("Last String :");
        System.out.println(lastElement.isPresent()?lastElement.get() :"No Element Found");
    }
}
