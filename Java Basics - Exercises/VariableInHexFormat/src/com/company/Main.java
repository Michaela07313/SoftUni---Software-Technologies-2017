package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int result = Integer.parseInt(input, 16);
        System.out.print(result);
    }
}
