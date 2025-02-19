public class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Error: Missing arguments. Usage: java Calculator <operation> <num1> <num2>");
            System.exit(1);
        }

        String operation = args[0].trim().toLowerCase();
        int num1, num2;

        try {
            num1 = Integer.parseInt(args[1]);
            num2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter valid integers.");
            System.exit(1);
            return;
        }

        if ("add".equals(operation)) {
            System.out.println("Result: " + (num1 + num2));
        } else if ("sub".equals(operation)) {
            System.out.println("Result: " + (num1 - num2));
        } else {
            System.out.println("Error: Invalid operation! Use 'add' or 'sub'.");
        }
    }
}
