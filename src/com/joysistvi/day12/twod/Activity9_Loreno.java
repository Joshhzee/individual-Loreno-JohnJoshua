package com.joysistvi.day12.twod;

import java.util.Scanner;

public class Activity9_Loreno {

    private static final int BANNER_WIDTH = 35;
    private static final int TITLE_INDENT = 9;
    private static final int NAME_WIDTH = 20;
    private static final int COLUMN_WIDTH = 10;
    private static final int MIN_LINE_WIDTH = 65;

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        printBanner("Average Calculator");

        int studentCount = readInt("Enter number of students: ");
        int subjectCount = readInt("Enter number of subjects: ");

        String[] subjects = readSubjectNames(subjectCount);

        String[] studentNames = new String[studentCount];
        int[][] grades = new int[studentCount][subjectCount];

        for (int i = 0; i < studentCount; i++) {
            studentNames[i] = readStudentName(i + 1);
            grades[i] = readGrades(subjects);
        }

        double[] averages = new double[studentCount];
        for (int i = 0; i < studentCount; i++) {
            averages[i] = calculateAverage(grades[i]);
        }

        // Display the results
        printReport(studentNames, subjects, grades, averages);
    }


    private static int readInt(String message) {
        System.out.print(message);
        return Integer.parseInt(input.nextLine().trim());
    }

    private static String readText(String message) {
        System.out.print(message);
        return input.nextLine().trim();
    }

    private static String[] readSubjectNames(int subjectCount) {
        String[] subjects = new String[subjectCount];

        System.out.println();
        System.out.println("Enter subject names:");
        for (int i = 0; i < subjectCount; i++) {
            subjects[i] = readText("Subject " + (i + 1) + ": ");
        }
        return subjects;
    }

    private static String readStudentName(int studentNumber) {
        System.out.println();
        return readText("Name of Student " + studentNumber + ": ");
    }

    private static int[] readGrades(String[] subjects) {
        int[] studentGrades = new int[subjects.length];

        System.out.println("Enter grades for each subject:");
        for (int i = 0; i < subjects.length; i++) {
            studentGrades[i] = readInt(subjects[i] + ": ");
        }
        return studentGrades;
    }


    private static double calculateAverage(int[] studentGrades) {
        int total = 0;
        for (int grade : studentGrades) {
            total += grade;
        }
        return (double) total / studentGrades.length;
    }


    private static void printBanner(String title) {
        String line = "=".repeat(BANNER_WIDTH);

        System.out.println(line);
        System.out.println(" ".repeat(TITLE_INDENT) + title);
        System.out.println(line);
    }

    private static void printReport(String[] studentNames, String[] subjects,
                                    int[][] grades, double[] averages) {
        System.out.println();
        System.out.println();
        printBanner("Grades Report");

        System.out.printf("%-" + NAME_WIDTH + "s", "Student");
        for (String subject : subjects) {
            System.out.printf("%-" + COLUMN_WIDTH + "s", subject);
        }
        System.out.println("Average");

        // Separator line (grows if there are many subjects)
        int tableWidth = NAME_WIDTH + (subjects.length + 1) * COLUMN_WIDTH;
        System.out.println("-".repeat(Math.max(MIN_LINE_WIDTH, tableWidth)));

        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("%-" + NAME_WIDTH + "s", studentNames[i]);
            for (int grade : grades[i]) {
                System.out.printf("%-" + COLUMN_WIDTH + "d", grade);
            }
            System.out.printf("%.2f%n", averages[i]);
        }
    }
}
