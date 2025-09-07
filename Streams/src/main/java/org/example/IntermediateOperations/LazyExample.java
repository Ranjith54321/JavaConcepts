package org.example.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ranjith S on 24/11/24.
 **/
public class LazyExample {
    private static void streamOne() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> integerStream = integerList.stream()
                .filter((Integer n) -> n>1)
                .peek((Integer n) -> System.out.print(" n : " + n));
    }

    private static void streamTwo() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> integerStream = integerList.stream()
                .filter((Integer n) -> n>1)
                .peek((Integer n) -> System.out.println(" n : " + n));

        long count = integerStream.count(); // count is one of the terminal operation.
    }


    public static void main(String[] args) {
        // streamOne(); // we can not see any output / peek.
        streamTwo(); // here, terminal operation will trigger the process. That is why intermediate operations is called as Lazy
        /**
            The Lazy nature of intermediate operations can be useful
            -> We have stream but, we will use only when certain condition met.
                At that time we can use the terminal operation to trigger the stream and get the result.
            -> It seems one of the approach to avoid unnecessary computation.
         */
    }

}
