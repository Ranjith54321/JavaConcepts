package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ranjith S on 24/11/24.
 **/
public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 110);

        // Sequential processing
        long sequentialProcessingStartTime = System.currentTimeMillis();
        integerList.stream()
                .map((Integer n) -> n*n)
                .forEach((Integer n) -> System.out.print(n + " "));
        System.out.println();
        System.out.println("Sequential processing Time Taken : " + (System.currentTimeMillis() - sequentialProcessingStartTime) + " millisecond");
        System.out.println();

        // Parallel processing
        long parallelProcessingStartTime = System.currentTimeMillis();
        integerList.parallelStream()
                .map((Integer n) -> n*n)
                .forEach((Integer n) -> System.out.print(n + " "));
        System.out.println();
        System.out.println("Parallel processing Time Taken : " + (System.currentTimeMillis() - parallelProcessingStartTime) + " millisecond");
    }
}
