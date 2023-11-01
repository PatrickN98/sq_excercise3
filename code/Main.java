public class Main {
    public static void main(String[] args) {
        // Parse command-line arguments
        int num1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int num2 = Integer.parseInt(args[2]);

        // Create a Calculator instance
        Calculator calculator = new Calculator();

        // Calculate the result
        int result = calculator.calculate(num1, operator, num2);

        // Display the result
        System.out.printf("The Result is: " + result);
    }
}
