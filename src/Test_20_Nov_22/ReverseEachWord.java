package Test_20_Nov_22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        List<String> inputList= Arrays.asList("kishor","Ramesh");
        List<String> stringList = inputList.stream()
                .map(s -> reverseString(s))
                .collect(Collectors.toList());

        System.out.println("Reverse String List"+stringList);

    }

    private static String reverseString(String s) {
        char [] chars=s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
