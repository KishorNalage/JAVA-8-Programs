package Test18_Nov_24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Find SubStrings of input string
public class FindSubStrings {
    public static void main(String[] args) {
        String inputString="aabbcdefghig";
        List<String> substrings = getSubstrings(inputString);
       // substrings.forEach(System.out::println);
        System.out.println(substrings);

    }
    public static List<String> getSubstrings(String inputString)
    {
        List<String> subStringsList = IntStream.rangeClosed(0, inputString.length())
                .boxed()
                .flatMap(
                        i -> IntStream.range(i + 1, inputString.length() + 1)
                                .mapToObj(j -> inputString.substring(i, j))
                ).collect(Collectors.toList());

  return subStringsList;
    }
}
