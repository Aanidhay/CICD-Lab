public class Calculator {
    public static void main(String[] args) {
        // Check if the required arguments are passed
         System.out.println("Start");
        
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
        System.out.println("Start1");

        // Perform the operation
        switch (operation) {
            case "add":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "sub":
                System.out.println("Result: " + (num1 - num2));
                break;
            default:
                System.out.println("Error: Invalid operation! Use 'add' or 'sub'.");
        }
    }
}
