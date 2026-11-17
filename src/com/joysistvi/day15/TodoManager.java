package com.joysistvi.day15;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n========= To do Manager Menu =========");
        System.out.println("1. Add your task");
        System.out.println("2. View all of your tasks");
        System.out.println("3. Update your task");
        System.out.println("4. Remove a task");
        System.out.println("5. Clear all of your tasks");
        System.out.println("0. Exit");
    }

    public static void addTask() {
        System.out.print("Enter a task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        System.out.println("\nTasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void updateTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        viewTasks();

        int taskNumber = getInput("Enter task number to update: ");

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        System.out.print("Enter new task: ");
        String newTask = scanner.nextLine();

        tasks.set(taskNumber - 1, newTask);
        System.out.println("Task updated.");
    }

    public static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        viewTasks();

        int taskNumber = getInput("Enter task number to remove: ");

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        tasks.remove(taskNumber - 1);
        System.out.println("Task removed.");
    }

    public static void clearTasks() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }

    public static void main(String[] args) {

        while (true) {
            showMenu();

            int choice = getInput("\nEnter your choice: ");

            switch (choice) {
                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    updateTask();
                    break;

                case 4:
                    removeTask();
                    break;

                case 5:
                    clearTasks();
                    break;

                case 0:
                    System.out.println("Exiting To do Manager. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
