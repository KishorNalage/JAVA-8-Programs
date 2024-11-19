package Test_19_Nov_24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find first repeated character in a string
//String inputString="Java Concept Of The Day";
//First Repeatative Character:a
//Character Count List : {j=1, a=3, v=1, c=2, o=2, n=1, e=2, p=1, t=2, f=1, h=1, d=1, y=1}
public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String inputString="Java Concept Of The Day";
        Optional<Character> firstRepeatedCharacter= getFirstRepeatedCharacter(inputString);
        System.out.print("First Repeatative Character:");
        System.out.println(firstRepeatedCharacter.isPresent()?firstRepeatedCharacter.get():"No repeatative Character");

        System.out.println("Character Count List : "+getCountList(inputString));
    }

    private static Optional<Character> getFirstRepeatedCharacter(String inputString) {
        Optional<Character> character=inputString.chars()
                .filter(ch-> !Character.isWhitespace(ch))
                .map(Character::toLowerCase)
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n->n.getValue()>1)
                .map(map->map.getKey())
                .distinct()
                .findFirst();
        return  character;
    }

    public static Map<Character,Long> getCountList(String inputString)
    {
        Map<Character, Long> countMap = inputString.chars()
                .filter(ch -> !Character.isWhitespace(ch))
                .map(Character::toLowerCase)
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));
                /*.collect(LinkedHashMap<Character,Long>::new,
                        (map,c)->map.put(c,map.getOrDefault(c,0L)+1),Map::putAll);*/
        return countMap;
    }
}
