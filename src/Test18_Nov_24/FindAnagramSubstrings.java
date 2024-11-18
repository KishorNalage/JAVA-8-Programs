package Test18_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAnagramSubstrings {
    public static void main(String[] args) {
        String inputString="abca";
        List<List<String>> anagramString= getAnagramString(inputString);
       anagramString.forEach(strings -> {
           if(strings.size()>1)
               System.out.println(strings);
       });
    }

    private static List<List<String>> getAnagramString(String inputString) {
        List<List<String>> stringList = IntStream.range(0, inputString.length())
                .boxed()
                .flatMap(i -> (IntStream.range(i + 1, inputString.length() + 1)
                        .mapToObj(j -> inputString.substring(i, j))))
                .collect(Collectors.groupingBy(FindAnagramSubstrings::getSortedString))
                .values()
                .stream()
                .filter(group->group.size()>1)
                .collect(Collectors.toList());

        return stringList;
    }

    private static String getSortedString(String s) {
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        return  new String(chars);
    }
}
