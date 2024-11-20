package Test_20_Nov_22;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UnsortedArrayIntoSorted {
    public static void main(String[] args) {
        int [] randomNumbers ={12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] randomNumber2 = {4, 32, 2, 5, 6, 78, 98, 53, 90};
        int[] array = IntStream.concat
                (Arrays.stream(randomNumbers),
                        Arrays.stream(Arrays.stream(randomNumber2)
                                .distinct()
                                .toArray())).toArray();
        System.out.println(array);
    }
}
