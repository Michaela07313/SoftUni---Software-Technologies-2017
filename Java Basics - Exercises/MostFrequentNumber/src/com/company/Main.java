package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = Arrays.stream(
                new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int currentPosition = numbers[0];
        int bestStart = currentPosition;
        int countFrequent = 1;
        int bestCount = countFrequent;


        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == currentPosition) {
                countFrequent++;

                if (countFrequent > bestCount) {
                    bestStart = currentPosition;
                    bestCount = countFrequent;
                }
            }
            else {
                countFrequent = 1;
            }
        }

        if(numbers.length == 1) {
            System.out.print(numbers[0]);
        }
        else {
            System.out.print(bestStart);
        }

    }
}
