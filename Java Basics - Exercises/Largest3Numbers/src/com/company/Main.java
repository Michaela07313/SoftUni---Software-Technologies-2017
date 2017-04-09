package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = Arrays.stream(
                new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numbers);
        int count = Math.min(3, numbers.length);

        for(int i = 0; i < count; i++) {
            System.out.print(numbers[numbers.length - 1 - i] + " ");
        }
    }
}
