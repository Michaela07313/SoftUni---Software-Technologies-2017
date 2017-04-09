package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<String> parts = new ArrayList<String>()
        {{
            add("Excellent product.");
            add("Such a great product.");
            add("I always use that product.");
            add("Best product of its category.");
            add("Exceptional product.");
            add("I can’t live without this product.");
        }};

        ArrayList<String> events = new ArrayList<String>()
        {{      add("Now I feel good.");
                add("I have succeeded with this product.");
                add("Makes miracles. I am happy of the results!");
                add("I cannot believe but now I feel awesome.");
                add("Try it yourself, I am very satisfied.");
                add("I feel great!");
        }};

        ArrayList<String> authors = new ArrayList<String>()
        {{
            add("Diana");
            add("Petya");
            add("Stella");
            add("Elena");
            add("Katya");
            add("Iva");
            add("Annie");
            add("Eva");
        }};

        ArrayList<String> cities = new ArrayList<String>()
                {{
                        add("Burgas");
                        add("Sofia");
                        add("Plovdiv");
                        add("Varna");
                        add("Ruse");
                }};

        Random r = new Random();

        for (int i = 0; i < n; i++)
        {
            int randomIndexPhrase = r.nextInt(parts.size());
            int randomIndexEvent = r.nextInt(events.size());
            int randomIndexAuthor = r.nextInt(authors.size());;
            int randomIndexCity = r.nextInt(cities.size());

            System.out.println(parts.get(randomIndexPhrase) + " " +
                    events.get(randomIndexEvent) + " " +
                    authors.get(randomIndexAuthor) + " - " +
                    cities.get(randomIndexCity) + ".");
        }
    }
}
