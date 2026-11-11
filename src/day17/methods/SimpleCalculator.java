package day17.methods;

import java.util.*;

public class SimpleCalculator {

    // Methods that perform math equations

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulo(double a, double b) {
        return a % b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Select which arithmetic method to execute
    public static double calculate(double a, double b, char operator) {
        return switch (operator) {
            case '+' -> add(a, b);
            case '-' -> subtract(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            case '%' -> modulo(a, b);
            case '^' -> power(a, b);
            default -> 0;
        };
    }

    // Helper method: Read and validate numerical input
    public static double readNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                scanner.nextLine();
                return number;
            }

            scanner.nextLine();
            System.out.println("Invalid number. Please try again.");
        }
    }

    // Helper method: Read and validate an operator
    public static char readOperator(Scanner scanner) {
        while (true) {
            System.out.print("Enter operator (+, -, *, /, %, ^): ");
            String input = scanner.nextLine().trim();

            if (input.length()  == 1 &&
                    "+-*/%^".indexOf(input.charAt(0)) >= 0) {
                return input.charAt(0);
            }

            System.out.println("Invalid Operator. Please try again.");
        }
    }

    // Ask the user whether to continue
    public static boolean askContinue(Scanner scanner) {
        System.out.print("Calculate again(y/n): ");
        String answer = scanner.nextLine().trim().toLowerCase();

        return answer.equals("y") || answer.equals("yes");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        System.out.println("=== Simple Java Calculator ===");

        while (running) {
            double num1 = readNumber(scanner, "Enter first number: ");
            char operator = readOperator(scanner);
            double num2 = readNumber(scanner, "Enter second number: ");

            if ((operator == '/' || operator == '%') && num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                double result = calculate(num1, num2, operator);

                System.out.println(num1 + " " + operator + " " +
                        num2 + " = " + result);
            }

            running = askContinue(scanner);
            System.out.println();
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
