package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-10, 5, -3, 7, 0, 18, 15, 22, -100, -47, -29, 18, 19, 45);
        List<Integer> positive = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toList());

        positive.forEach(System.out::println);
    }
}