package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputEmailAddress = scan.nextLine().split("@");
        String domain = inputEmailAddress[1];
        String inputEmail = inputEmailAddress[0] + "@" + inputEmailAddress[1];

        String inputText = scan.nextLine();

        String[] text = new String[inputText.length()];
        text[0] = inputText;
        String replacement = "";


        if (text[0].toLowerCase().indexOf(inputEmail.toLowerCase()) != -1 ) {
            for(int x = 0 ; x < inputEmailAddress[0].length() ; x++){
                replacement  += "*";
            }
            System.out.println(text[0].replaceAll(inputEmail,replacement + "@" + domain));
        }
    }
}
