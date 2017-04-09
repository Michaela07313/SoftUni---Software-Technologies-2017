package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(!checkNumbers(num1,num2,num3) &&
                !checkNumbers(num2,num1,num3) &&
                !checkNumbers(num3,num2,num1) &&
                !checkNumbers(num2,num3,num1) &&
                !checkNumbers(num3,num1,num2) &&
                !checkNumbers(num1,num3,num2)) {
            System.out.print("No");
        }
    }

    public static boolean checkNumbers(int num1, int num2, int sum) {

        if(num1 + num2 != sum) {
            return false;
        }

        if(num1 <= num2) {
            System.out.printf("%d + %d = %d\n", num1, num2, sum);
        }
        else {
            System.out.printf("%d + %d = %d\n", num2, num1, sum);
        }

        return true;
    }
}
