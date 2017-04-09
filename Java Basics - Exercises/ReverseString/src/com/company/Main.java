package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder str = new StringBuilder();
        str.append(scan.nextLine());
        System.out.println(str.reverse());
    }
}
