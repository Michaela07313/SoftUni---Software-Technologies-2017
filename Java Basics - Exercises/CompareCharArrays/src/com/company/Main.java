package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list1 = new ArrayList<String>();

        String input1 = scan.nextLine();
        String input2 = scan.nextLine();

        list1.add(input1);
        list1.add(input2);

        Collections.sort(list1);

        for(String x : list1) {
            System.out.println(x.replaceAll("\\s+",""));
        }
    }
}
