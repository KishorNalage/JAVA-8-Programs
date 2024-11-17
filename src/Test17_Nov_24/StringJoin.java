package Test17_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a list of strings, convert them to uppercase and join them into a single string.
public class StringJoin {
    public static void main(String[] args) {
        List<String> stringsList= Arrays.asList("kishor","is", "my","name");
        String outString = stringsList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));

        System.out.println("Join String:"+outString);
    }
}
