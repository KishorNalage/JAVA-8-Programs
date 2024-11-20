package Test_20_Nov_22;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1="kishorkr";
        String str2="kishorr";
       boolean isAnagram= isAnagram(str1,str2);
        System.out.println("Strings are anagram :"+isAnagram);
    }

    private static boolean isAnagram(String str1, String str2) {

        Map<String, Long> map1 = Arrays.asList(str1.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> map2 = Arrays.asList(str2.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if(map1.equals(map2))
           return true;
        else
            return false;

    }
}
