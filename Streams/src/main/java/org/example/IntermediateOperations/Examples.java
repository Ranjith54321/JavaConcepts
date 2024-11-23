package org.example.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by Ranjith S on 23/11/24.
 **/
public class Examples {
    public static void filterExample() {
        Stream<String> nameStream = Stream.of("HELLO", "EVERYONE", "HOW", "ARE", "YOU", "DOING");
        Stream<String> filteredNames = nameStream.filter((String name) -> name.length()<=3); // return type is Stream only
        List<String> result = filteredNames.collect(Collectors.toList());
        System.out.println(" result : " +result);
    }

    public static void mapExample() {
        Stream<String> nameStream = Stream.of("HELLO", "EVERYONE", "HOW", "ARE", "YOU", "DOING");
        Stream<Integer> nameLengths = nameStream.map((String name) -> name.length()); // store the return type of the Function. Here return type if Integer
        List<Integer> result = nameLengths.collect(Collectors.toList());
        System.out.println(" nameLengths : " + result);
    }

    public static void flatMapExample() {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"),
                Arrays.asList("CONCEPTS", "ARE", "CLEAR"),
                Arrays.asList("ITS", "VERY", "EASY")
        );
        Stream<String> singleList = nestedList.stream().flatMap((List<String> list) -> list.stream());
        List<String> result = singleList.collect(Collectors.toList());
        System.out.println(" result : " + result);
    }
    public static void flatMapExample2() {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"),
                Arrays.asList("CONCEPTS", "ARE", "CLEAR"),
                Arrays.asList("ITS", "VERY", "EASY")
        );
        // we can perform any operation in the flat map also. Inside flatmap we have stream only.
        // So, in stream we can perform intermediate operations
        Stream<String> singleList = nestedList.stream().flatMap((List<String> list) -> list.stream().map((String name) -> name.toLowerCase()));
        List<String> result = singleList.collect(Collectors.toList());
        System.out.println(" result : " + result);
    }

    public static void distinctExample() {
        Integer[] arr = {5,5,3,21,66,4,3,66};
        Stream<Integer> arrStream = Arrays.stream(arr).distinct().sorted();
        List<Integer> result = arrStream.collect(Collectors.toList());
        System.out.println(" result : " + result);
    }

    public static void sortedExample() {
        Integer[] arr = {5,5,3,21,66,4,3,66};
        Stream<Integer> arrStream = Arrays.stream(arr).sorted();
        List<Integer> result = arrStream.collect(Collectors.toList());
        System.out.println(" result : " + result);
    }

    public static void sortedExample2() {
        /**
         * we have another sorted which accepts Comparator
         */
        Integer[] arr = {5,5,3,21,66,4,3,66};
        Stream<Integer> arrStream = Arrays.stream(arr).sorted((Integer n1, Integer n2) -> n2-n1); // descending order
        List<Integer> result = arrStream.collect(Collectors.toList());
        System.out.println(" result : " + result);
    }

    public static void peekExample() {
        Integer[] arr = {5,5,3,21,66,4,3,66};
        Stream<Integer> arrStream = Arrays.stream(arr)
                .filter((Integer i) -> i>5)
                .peek((Integer i) -> System.out.println(" i: " + i))
                .map((Integer i) -> i*-1);
        List<Integer> result = arrStream.collect(Collectors.toList());
        System.out.println(" result : " + result);
    }

    public static void limitExample() {
        Integer[] arr = {5,5,3,21,66,4,3,66};
        Stream<Integer> arrStream = Arrays.stream(arr).limit(4);
        List<Integer> result = arrStream.collect(Collectors.toList());
        System.out.println(" result : " + result);
    }

    public static void skipExample() {
        Integer[] arr = {5,5,3,21,66,4,3,66};
        Stream<Integer> arrStream = Arrays.stream(arr).skip(2);
        List<Integer> result = arrStream.collect(Collectors.toList());
        System.out.println(" result : " + result);
    }

    public static void mapToIntExample() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        IntStream intStream = Arrays.stream(arr).map((int i) -> i*2); // Now we can do operation with primitive type itself.
        int[] result = intStream.toArray();
        System.out.println(" result : ");
        for (int i: result) {
            System.out.print(" " + i);
        }
    }

    public static void mapToIntExample2() {
        List<String> numberString = Arrays.asList("1", "2", "3", "4");
        IntStream intStream = numberString.stream().mapToInt((String s) -> Integer.parseInt(s));
        int[] result = intStream.toArray();
        System.out.println(" result : ");
        for (int i: result) {
            System.out.print(" " + i);
        }
    }

    public static void mapToLongExample() {
        long[] arr = new long[]{1, 2, 3, 4, 5, 6};
        LongStream intStream = Arrays.stream(arr).map((long i) -> i + (Long.MAX_VALUE-100));
        long[] result = intStream.toArray();
        System.out.println(" result : ");
        for (long i: result) {
            System.out.print(" " + i);
        }
    }

    public static void mapToDoubleExample() {
        double[] arr = new double[]{1, 2, 3, 4, 5, 6};
        DoubleStream intStream = Arrays.stream(arr).map((double i) -> i + (Double.MAX_VALUE-100));
        double[] result = intStream.toArray();
        System.out.println(" result : ");
        for (double i: result) {
            System.out.print(" " + i);
        }
    }



    public static void main(String[] args) {
//        filterExample();
//        mapExample();
//        flatMapExample();
//        flatMapExample2();
//        distinctExample();
//        sortedExample();
//        sortedExample2();
//        peekExample();
//        limitExample();
//        skipExample();
//        mapToIntExample();
//        mapToIntExample2();
//        mapToLongExample();
        mapToDoubleExample();
    }
}
