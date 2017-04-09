package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] tokens = input.split("/|://");

        if (input.indexOf("://") != -1) {
            String protocol = tokens[0];
            String server = tokens[1];
            System.out.println("[protocol] = \"" + protocol + "\"");
            System.out.println("[server] = \"" + server + "\"");

            if (input.indexOf("/") != -1) {
                String resource = input.substring(protocol.length() + server.length() + 3);
                resource = resource.startsWith("/") ? resource.substring(1) : resource;
                System.out.println("[resource] = \"" + resource + "\"");
            }
            else {
                System.out.println("[resource] = \"" + "\"");
            }
        }
        else {
            String server = tokens[0];
            System.out.println("[protocol] = \"" + "\"");
            System.out.println("[server] = \"" + server + "\"");

            if (input.indexOf("/") != -1) {
                String resource = input.substring(server.length());
                resource = resource.startsWith("/") ? resource.substring(1) : resource;
                System.out.println("[resource] = \"" + resource + "\"");
            }
            else {
                System.out.println("[resource] = \"" + "\"");
            }
        }
    }
}
