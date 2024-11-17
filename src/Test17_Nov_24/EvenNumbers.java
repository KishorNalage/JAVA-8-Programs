package Test17_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(2,3,4,5,6,7,8);
        System.out.println("Even Numbers List :"+evenNumbers(integerList));
        System.out.print("Get Second Even Number :");
        Optional<Integer> secondNumber=getSecondEvenNumber(integerList);
        System.out.println(secondNumber.isPresent()?secondNumber.get() :"No second even number found");

    }

    private static Optional<Integer> getSecondEvenNumber(List<Integer> integerList) {
        Optional<Integer> second = integerList.stream() //Stream<Integer>
                .filter(num -> num % 2 == 0)         //Stream<Integer> ->filter number with predicate num%2!=0
                .skip(1)                           //Skip first element
                .findFirst();
        return second;
    }

    private static List<Integer> evenNumbers(List<Integer> integerList) {
        List<Integer> evenNumbers= integerList.stream() //Stream<Integer>
                .filter(num->num%2==0)  //Stream <Integer> ->filter out with predicate num%2!=0
                .collect(Collectors.toList());  //List<Integer>
        return  evenNumbers;
    }
}
