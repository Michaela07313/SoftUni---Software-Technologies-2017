package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Student> studentsData = new ArrayList<Student>();

        for(int i = 0; i < n; i++) {

            String[] inputLine = scan.nextLine().split(" ");
            String name = inputLine[0];
            ArrayList<Double> inputGrades = new ArrayList<>();

            for (int j = 1; j < inputLine.length; j++)  {
                inputGrades.add(Double.parseDouble(inputLine[j]));
            }

            Student currentStudent = new Student(name, inputGrades);
            studentsData.add(currentStudent);
        }

        ArrayList<Student> filteredStudentGrades = studentsData
                .stream()
                .filter(s -> s.getAverageGrade() >= 5)
                .collect(Collectors.toCollection(ArrayList<Student>::new));

        filteredStudentGrades.sort(Comparator.comparing(Student::getName)
                .thenComparing(
                        Collections.reverseOrder(Comparator.comparing(Student::getAverageGrade))));



        for(Student st: filteredStudentGrades) {
            System.out.printf(st.name + " -> %.2f%n", st.averageGrade);
        }

    }

    static class Student {
        private String name;
        private ArrayList<Double> grades;
        private double averageGrade;

        private Student(String name, ArrayList<Double> grades) {
            this.name = name;
            this.grades = grades;
            this.averageGrade = getAverageGrade();
        }

        public String getName() {
            return name;
        }

        private double getAverageGrade() {
            double sum = 0;
            for (double grade : grades)
                sum += grade;
            return sum / grades.size();
        }
    }

}
