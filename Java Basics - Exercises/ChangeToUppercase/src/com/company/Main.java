package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        String[] text = new String[inputText.length()];
        text[0] = inputText;

        final Pattern pattern = Pattern.compile("<upcase>(.+?)</upcase>");
        final Matcher matcher = pattern.matcher(text[0]);

        while (matcher.find()) {
            text[0] = text[0].replaceAll(matcher.group(), matcher.group().toUpperCase());
        }

        System.out.println(text[0].replaceAll("<UPCASE>|</UPCASE>", ""));
    }
}
