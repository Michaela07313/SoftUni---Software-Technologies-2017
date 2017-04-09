package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean result = Boolean.parseBoolean(input);

        if(result) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }

    }
}
