package Test17_Nov_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, remove duplicates using Streams.
public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> intergerList= Arrays.asList(1,2,3,4,3,5,3,5,6,7,4,8);
        List<Integer> list = intergerList.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}
