package com.company;

import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstLine = Arrays.stream(scan.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondLine = Arrays.stream(scan.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt).toArray();

        Point firstPoint = new Point(firstLine[0], firstLine[1]);
        Point secondPoint = new Point(secondLine[0], secondLine[1]);
        Circle firstCircle = new Circle(firstLine[2]);
        Circle secondCircle = new Circle(secondLine[2]);

        double result = GetDistance(firstPoint, secondPoint);

        if(result <= firstCircle.getRadius() + secondCircle.getRadius()) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static double GetDistance(Point point1, Point point2)
    {
        double distance = Math.sqrt(
                Math.pow(point2.getX() - point1.getX(), 2) +
                        Math.pow(point2.getY() - point1.getY(), 2));
        return distance;
    }

    static class Circle {
        private int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

    }

    static class Point {
        private Integer X;
        private Integer Y;

        public Point(Integer x, Integer y) {
            X = x;
            Y = y;
        }

        public Integer getX() {
            return X;
        }

        public Integer getY() {
            return Y;
        }
    }


}
