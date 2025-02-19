import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for operation
        System.out.print("Enter operation (add/sub): ");
        String operation = scanner.nextLine().trim().toLowerCase();

        // Asking for the first number
        System.out.print("Enter first number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // discard invalid input
            System.out.print("Enter first number: ");
        }
        int num1 = scanner.nextInt();

        // Asking for the second number
        System.out.print("Enter second number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next(); // discard invalid input
            System.out.print("Enter second number: ");
        }
        int num2 = scanner.nextInt();

        // Performing the operation
        if ("add".equals(operation)) {
            System.out.println("Result: " + (num1 + num2));
        } else if ("sub".equals(operation)) {
            System.out.println("Result: " + (num1 - num2));
        } else {
            System.out.println("Invalid operation! Use 'add' or 'sub'.");
        }

        scanner.close();
    }
}
