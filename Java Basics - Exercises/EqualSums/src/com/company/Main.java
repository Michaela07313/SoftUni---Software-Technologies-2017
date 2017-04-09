package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = Arrays.stream(
                new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        if (numbers.length == 1) {
            System.out.print("0");
            return;
        }

        int leftSum = 0;
        int rightSum = 0;
        boolean found = false;

        for (int pos = 0; pos < numbers.length; pos++) {

            for (int L = 0; L < pos; L++) {
                leftSum += numbers[L];
            }

            for (int R = pos + 1; R < numbers.length; R++) {
                rightSum += numbers[R];
            }

            if (leftSum == rightSum) {
                System.out.print(pos);
                found = true;
            }
            else {
                leftSum = 0;
                rightSum = 0;
            }
        }

        if (found == false) {
            System.out.print("no");
        }
    }
}
