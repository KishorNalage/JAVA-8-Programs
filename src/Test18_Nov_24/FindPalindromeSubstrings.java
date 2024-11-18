package Test18_Nov_24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindPalindromeSubstrings {
    public static void main(String[] args) {
        String inputString="aabbccddefg";
        List<String> PalindromeSubStrings=getPalindromeSubStrings(inputString);
        System.out.println(PalindromeSubStrings);
    }

    private static List<String> getPalindromeSubStrings(String inputString) {
        List<String> stringList = IntStream.rangeClosed(0, inputString.length())
                .boxed()
                .flatMap(i -> (IntStream.range(i + 1, inputString.length() + 1)
                        .mapToObj(j -> inputString.substring(i, j))))
                .filter(s->getPalindrome(s))
                .collect(Collectors.toList());
        return  stringList;
    }

    private static boolean getPalindrome(String s) {
        String reversed= new StringBuilder(s).reverse().toString();
        if(s.equals(reversed))
            return true;
        else
            return false;
    }
}
