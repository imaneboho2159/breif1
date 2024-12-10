
import java.util.Scanner;

public class Calculator {

    // Addition
    static double Addition(double n1, double n2) {
        return (n1 + n2);
    }

    // Subtraction
    static double Subtraction(double n1, double n2) {
        return (n1 - n2);
    }

    // Multiplication
    static double Multiplication(double n1, double n2) {
        return (n1 * n2);
    }

    // Division
    static double Division(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Invalid number! Division by zero.");
            return Double.NaN; // To indicate an error
        }
        return (n1 / n2);
    }

    // Exponentiation
    static double Puissance(double n1, double exponent) {
        return Math.pow(n1, exponent);
    }

    // Square Root
    static double Racine(double n1) {
        if (n1 < 0) {
            System.out.println("Invalid number! Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(n1);
    }

    // Factorial
    static int Factorielle(int n1) {
        if (n1 < 0) {
            System.out.println("Invalid number! Factorial is defined for non-negative integers.");
            return -1;
        }
        if (n1 == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n1; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, exponent;
        System.out.print("Enter the first number: ");
        n1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        n2 = scanner.nextDouble();

        int choice;

        do {
            System.out.println("\n1-Addition (+)");
            System.out.println("2-Subtraction (-)");
            System.out.println("3-Multiplication (*)");
            System.out.println("4-Division (/)");
            System.out.println("5-Puissance");
            System.out.println("6-Racine");
            System.out.println("7-Factorielle");
            System.out.println("9-Exit the system");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + Addition(n1, n2));
                    break;
                case 2:
                    System.out.println("Result: " + Subtraction(n1, n2));
                    break;
                case 3:
                    System.out.println("Result: " + Multiplication(n1, n2));
                    break;
                case 4:
                    System.out.println("Result: " + Division(n1, n2));
                    break;
                case 5:
                    System.out.print("Enter the exponent: ");
                    exponent = scanner.nextDouble();
                    System.out.println("Result: " + Puissance(n1, exponent));
                    break;
                case 6:
                    System.out.println("Result: " + Racine(n1));
                    break;
                case 7:
                    int factorialResult = Factorielle((int) n1);
                    if (factorialResult != -1) {
                        System.out.println("Result: " + factorialResult);
                    }
                    break;
                case 9:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}
