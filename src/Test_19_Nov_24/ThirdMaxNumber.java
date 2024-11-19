package Test_19_Nov_24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8);
        Optional<Integer> thirdMaxNo = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();

        System.out.print("Third Max Number: ");
        System.out.println(thirdMaxNo.isPresent()?thirdMaxNo.get():"No Number Found");
    }
}
