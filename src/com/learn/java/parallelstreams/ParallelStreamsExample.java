package com.learn.java.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes)
    {

        long start = System.currentTimeMillis();
        for(int i=0;i<numberOfTimes;i++){
            supplier.get();
        }

        long end = System.currentTimeMillis();
        return end-start;
    }

    public static int sumSequentialStream()
    {
        return IntStream.rangeClosed(0,1000000)
                .sum();
    }
    public static int sumParallelStream()
    {
        return IntStream.rangeClosed(0,1000000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long sequentialDuration=checkPerformanceResult(ParallelStreamsExample::sumSequentialStream,20);
        System.out.println("Sequential Stream Result: "+sequentialDuration);

        long parallelDuration= checkPerformanceResult(ParallelStreamsExample::sumParallelStream,20);
        System.out.println("Parallel Stream Result: "+parallelDuration);
    }
}
