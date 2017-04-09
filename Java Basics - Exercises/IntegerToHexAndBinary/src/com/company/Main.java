package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();

        String resultToHex = Integer.toHexString(input);
        String resultInBin = Integer.toBinaryString(input);
        System.out.println(resultToHex.toUpperCase());
        System.out.print(resultInBin);
    }
}
