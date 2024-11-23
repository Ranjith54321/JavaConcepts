package org.example.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Ranjith S on 24/11/24.
 **/
public class Examples {

    public static void forEachExample() {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);
        integerList.stream()
                .filter((Integer n) -> n>3)
                .forEach((Integer n) -> System.out.println(" n : " + n));
    }

    public static void toArrayExample() {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);

        // toArray() return type is Object[]
        Object[] object = integerList.stream()
                .filter((Integer n) -> n>3)
                .toArray();

        // We have another flavour of toArray which accepts IntFunction, it's param is length of the stream
        Integer[] intArr = integerList.stream()
                .filter((Integer n) -> n>3)
                .toArray((int size) -> new Integer[size]);
    }

    public static void reduceExample() {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);
        Optional<Integer> result = integerList.stream()
                .reduce((Integer n1, Integer n2) -> n1+n2);
        System.out.println(" n : " + result.get());
        /*
            2, 1, 4, 7, 10 -> 2+1
            3, 4, 7, 10 -> 3+4
            7, 7, 10 -> 7+7
            14, 10 -> 14=10
            24

         */
    }

    public static void collectExample() {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);
        Set<Integer> result = integerList.stream()
                .collect(Collectors.toSet());
        System.out.println(" n : " + result);
    }

    public static void minExample() {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);
        Optional<Integer> result = integerList.stream()
                .min((Integer n1, Integer n2) -> n2-n1); // will return max value.
        System.out.println(" n : " + result.get());
    }

    public static void anyMatchExample() {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);
        boolean result = integerList.stream()
                .anyMatch((Integer n) -> n>7);
        System.out.println(" anyMatch n>7 : " + result);
    }

    public static void allMatchExample() {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);
        boolean result = integerList.stream()
                .allMatch((Integer n) -> n>7);
        System.out.println(" allMatch n>7 : " + result);
    }

    public static void noneMatchExample() {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);
        boolean result = integerList.stream()
                .noneMatch((Integer n) -> n>7);
        System.out.println(" noneMatch n>7 : " + result);
    }

    public static void findFirstExample() {
        List<Integer> integerList = Arrays.asList(2, 1, 4, 7, 10);
        Optional<Integer> result = integerList.stream()
                .findFirst();
        System.out.println(" first Element of the stream : " + result.get());
    }

    public static void findAnyExample() {
        List<Integer> integerList = Arrays.asList(9, 1, 4, 7, 10);
        Optional<Integer> result = integerList.stream()
                .findAny();
        System.out.println(" any Element of the stream : " + result.get());
    }

    public static void main(String[] args) {
//        forEachExample();
//        toArrayExample();
//        reduceExample();
//        collectExample();
//        minExample();
//        anyMatchExample();
//        allMatchExample();
//        noneMatchExample();
        findFirstExample();
        findAnyExample();
    }
}
