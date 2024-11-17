package Test17_Nov_24;

import jdk.jfr.Frequency;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Convert a list of strings into a map where
// the key is the length of the word and the value is the word
public class ListToMap {
    public static void main(String[] args) {
        List<String> inputList= Arrays.asList("kishor","ramesh","Mahim","Raju");

        covertedList(inputList);
        convertedLinkedHashMap(inputList);

    }

    private static void covertedList(List<String> inputList) {
        Map<Integer, ArrayList> map = inputList.stream()
                .collect(Collectors.toMap(String::length,
                        word -> new ArrayList<>(Collections.singletonList(word)),
                        (existing, replacement) ->
                        {
                            existing.addAll(replacement);
                            return existing;
                        }
                ));

        System.out.println(map);
    }
    private static void convertedLinkedHashMap(List<String> inputList) {
        LinkedHashMap<String, Long> countMap = inputList.stream()
                .map(s -> s.toLowerCase())
                .collect(LinkedHashMap<String, Long>::new,
                        (map, c) -> map.put(c, map.getOrDefault(c, 0L) + 1),
                        Map::putAll);

        System.out.println(countMap);


    }
}
