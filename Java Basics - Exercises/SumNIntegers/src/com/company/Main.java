package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int inputNumber = scan.nextInt();
            sum += inputNumber;
        }

        System.out.printf("Sum = %d", sum);


    }
}
