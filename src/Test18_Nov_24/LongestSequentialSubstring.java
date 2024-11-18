package Test18_Nov_24;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//   I/P:abcaabcde O/P: aabcde
public class LongestSequentialSubstring {
    public static void main(String[] args) {
        String inputString="abcaabcde";
        String longestSequentialString=getLongestSequentialSubstring(inputString);
        System.out.println(longestSequentialString);
    }

    private static String getLongestSequentialSubstring(String inputString) {
        String maxStr = IntStream.rangeClosed(0, inputString.length())
                .boxed()
                .flatMap(i -> (IntStream.range(i + 1, inputString.length() + 1)
                        .mapToObj(j -> inputString.substring(i, j))))
                .filter(sub -> isSequential(sub))              //List<Stream> ->filter() using predicate check sequential substring
                .max(Comparator.comparingInt(String::length))  //find max length SubString
                .get();

        return maxStr;
    }

    private static boolean isSequential(String sub) {
        for(int i=1; i<sub.length();i++)
        {
            if(sub.charAt(i)<sub.charAt(i-1)) //If character is smaller than previous it's not subsequent
                return false;
                }
        return  true;
    }
}
