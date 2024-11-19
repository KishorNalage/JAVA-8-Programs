package Test_19_Nov_24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        List<Integer> fibonacciList = Stream.iterate(
                        new int[]{0, 1},
                        fib -> new int[]{fib[1], fib[0] + fib[1]}
                ).limit(n)
                .map(f -> f[0])
                .collect(Collectors.toList());
        System.out.println(fibonacciList);
    }
}
