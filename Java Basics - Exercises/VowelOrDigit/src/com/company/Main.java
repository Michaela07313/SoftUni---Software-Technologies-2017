package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.binarySearch;

public class Main {

    public static void main(String[] args) {
        char[] vowels = { 'a', 'e', 'u', 'i', 'o' };
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        if(Character.isDigit(input.charAt(0))) {
            System.out.print("digit");
        }
        else {
            if(new String(vowels).contains(input)) {
                System.out.print("vowel");
            }
            else {
                System.out.print("other");
            }

        }
    }
}
