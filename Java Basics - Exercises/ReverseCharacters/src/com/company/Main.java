package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter1 = scan.nextLine();
        String letter2 = scan.nextLine();
        String letter3 = scan.nextLine();

        String result = letter1 + letter2 + letter3;

        for(int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }

    }
}
