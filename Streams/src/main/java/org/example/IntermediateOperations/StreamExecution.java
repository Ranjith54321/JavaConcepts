package org.example.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Ranjith S on 24/11/24.
 **/
public class StreamExecution {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);
        Stream<Integer> integerStream = integerList.stream()
                .filter((Integer n) -> n>=3)
                .peek((Integer n) -> System.out.println("after filter : " + n))
                .map((Integer n) -> n*-1)
                .peek((Integer n) -> System.out.println("after negating : " + n))
                .sorted()
                .peek((Integer n) -> System.out.println("after sorted : " + n));

        List<Integer> result = integerStream.collect(Collectors.toList());
    }
    /*
        Expected Output:
           after filter : 4
           after filter : 7
           after filter : 10

           after negating : -4
           after negating : -7
           after negating : -10

           after sorted : -10
           after sorted : -7
           after sorted : -4

        But, check the output and see the actual execution of stream
     */
}
