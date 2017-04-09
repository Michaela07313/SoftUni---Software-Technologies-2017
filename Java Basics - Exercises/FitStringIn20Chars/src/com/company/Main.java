package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);

        if(str.length() < 20) {
            for(int i = 0; i < 20 - str.length(); i++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
        else if(str.length() >= 20){
            str = str.substring(0, 20);
            System.out.println(str);
        }
    }
}
