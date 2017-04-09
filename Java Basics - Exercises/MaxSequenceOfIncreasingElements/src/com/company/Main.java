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
        int countIncreasingElements = 0;
        int bestCount = countIncreasingElements;


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] - numbers[i - 1] >= 1) {
                countIncreasingElements++;

                if (countIncreasingElements > bestCount) {
                    bestStart = currentPosition;
                    bestCount = countIncreasingElements;
                }
            }
            else {
                currentPosition = i;
                countIncreasingElements = 0;
            }
        }

        for (int i = bestStart; i <= (bestStart + bestCount); i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
