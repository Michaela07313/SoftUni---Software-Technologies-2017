package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Character> list1 = new ArrayList<Character>();
        StringBuilder str = new StringBuilder();
        str.append(scan.nextLine());

        for(int i = 0; i < str.length(); i++) {
            list1.add(str.charAt(i));
        }

        for(Character x: list1) {
            System.out.println(x + " " + "->" + " " + (x - 'a'));
        }
    }
}
