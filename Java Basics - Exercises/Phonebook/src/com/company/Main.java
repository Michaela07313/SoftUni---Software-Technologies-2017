package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();

        Map<String, String> phonebook = new LinkedHashMap<String, String>();


        while(!inputLine.toLowerCase().equals("end")) {
            String[] command = inputLine.split(" ");

            if(command[0].startsWith("A")) {
                String name = command[1];
                String number = command[2];

                if(!phonebook.containsKey(name)) {
                    phonebook.put(name, new String(number));
                }
                else {
                    phonebook.put(name, number);
                }
            }

            if(command[0].startsWith("S")) {
                String name = command[1];

                if(!phonebook.containsKey(name)) {
                    System.out.println("Contact " + name + " does not exist.");
                }
                else {
                    for (Map.Entry<String,String> entry : phonebook.entrySet()){
                        if (entry.getKey().equals(name)){
                            System.out.println(entry.getKey() + " -> " + entry.getValue());
                        }
                    }
                }
            }

            inputLine = scan.nextLine();
        }

    }
}
