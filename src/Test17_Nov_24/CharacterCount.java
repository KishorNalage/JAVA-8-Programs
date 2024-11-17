package Test17_Nov_24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "my name is kishor";
        LinkedHashMap<Character, Long> characterConut = getCharacterConut(inputString);
        characterConut.forEach((ch, count) -> System.out.println(ch + " :count: " + count));
        getThirdUniqueCharacter(inputString);
    }

    private static LinkedHashMap<Character, Long> getCharacterConut(String inputString) {
        LinkedHashMap<Character, Long> countMap = inputString.chars()                                          //IntStream<Character> Get Characters from String
                .filter(ch -> !Character.isWhitespace(ch))             //IntStream<Character> ->filter() : with predicate accept only non whitelist characters
                .map(Character::toLowerCase)                         //IntStream <Character> ->map()  : mapped  characters to lowercase
                .mapToObj(ch -> (char) ch)                             //Stream<Character>
                .collect(                                            //Collect values into
                        LinkedHashMap::new,          // LinkedHashMap<Character,Long>
                        (map, c)->map.put(c,map.getOrDefault(c,0L)+1), //Linked HashMap get default value of key & if found increase by 1
                        Map::putAll);                               //finally put all key's & respective count
        return countMap;
    }

    private static void getThirdUniqueCharacter(String inputString) {
        Optional<Character> third = inputString.chars()
                .filter(ch -> !Character.isWhitespace(ch))
                .map(Character::toLowerCase)
                .mapToObj(ch -> (char) ch)
                .collect(
                        LinkedHashMap<Character, Long>::new,
                        (map, c) -> map.put(c, map.getOrDefault(c, 0L) + 1),
                        Map::putAll
                )
                .entrySet()
                .stream()
                .filter(coll -> coll.getValue() == 1)
                .map(map -> map.getKey())
                .distinct()
                .skip(2)
                .findFirst();

        if (third.isPresent())
            System.out.println("Third Unique Character:"+third.get());

    }
}
