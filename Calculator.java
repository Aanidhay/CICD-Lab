def calculatorCode = """
public class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <add/sub> <num1> <num2>");
            return;
        }
        String operation = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        if ("add".equals(operation)) {
            System.out.println("Result: " + (num1 + num2));
        } else if ("sub".equals(operation)) {
            System.out.println("Result: " + (num1 - num2));
        } else {
            System.out.println("Invalid operation! Use 'add' or 'sub'.");
        }
    }
}
"""
def calcFile = new File(System.getenv("USERPROFILE") + "\\Desktop\\Calculator.java")
calcFile.text = calculatorCode
println "Calculator Java file created."
