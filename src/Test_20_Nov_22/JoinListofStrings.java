package Test_20_Nov_22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
 *
 * Given a list of strings, write a Java 8 program to join the strings
 * with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.
 */

public class JoinListofStrings {
    public static void main(String[] args) {
        List<String> languageList = Arrays.asList
                ("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
       String joinString= joinListofString(languageList);
        System.out.println("join String::"+joinString);
    }

    private static String joinListofString(List<String> languageList) {
        String str = languageList.stream()
                .collect(Collectors.joining(",","[","]")); //joining(CharSequence delimiter, CharSequence prefix,CharSequence suffix)
        return str;
    }
}
