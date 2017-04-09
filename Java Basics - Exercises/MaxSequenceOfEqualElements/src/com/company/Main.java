package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = Arrays.stream(
                new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int currentPosition = 0;
        int bestStart = currentPosition;
        int countEquals = 1;
        int bestCount = countEquals;


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                countEquals++;

                if (countEquals > bestCount) {
                    bestStart = currentPosition;
                    bestCount = countEquals;
                }
            }
            else {
                currentPosition = i;
                countEquals = 1;
            }
        }

        for (int i = bestStart; i < numbers.length; i++) {
            while(bestCount>0) {
                System.out.print(numbers[i] + " ");
                bestCount--;
            }
        }
    }
}
