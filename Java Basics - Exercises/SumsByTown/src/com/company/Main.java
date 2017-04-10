package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Double> sumsByTowns = new TreeMap<String, Double>();

        for(int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("\\|");
            String town = line[0].trim();
            Double income = Double.parseDouble(line[1].trim());

            if(sumsByTowns.containsKey(town)) {
                sumsByTowns.put(town, sumsByTowns.get(town) + income);
            }
            else {
                sumsByTowns.put(town, income);
            }
        }

        for(String key : sumsByTowns.keySet()) {
            System.out.println(key + " -> " + sumsByTowns.get(key));
        }


    }
}
