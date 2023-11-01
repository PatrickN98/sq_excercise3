public class Calculator {
    /**
     * Calculate the result based on the operator.
     *
     * @param num1     The first integer operand.
     * @param operator The operator (+ for addition, * for multiplication).
     * @param num2     The second integer operand.
     * @return The result of the calculation.
     */
    public int calculate(int num1, String operator, int num2) {
        switch (operator) {
            case "+":
                return this.addition(num1, num2);
            case "*":
                return this.multiplication(num1, num2);
            default:
                return 0; // Default result for unsupported operators.
        }
    }

    /**
     * Perform addition operation.
     *
     * @param num1 The first integer operand.
     * @param num2 The second integer operand.
     * @return The result of the addition operation.
     */
    private int addition(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Perform multiplication operation.
     *
     * @param num1 The first integer operand.
     * @param num2 The second integer operand.
     * @return The result of the multiplication operation.
     */
    private int multiplication(int num1, int num2) {
        return num1 * num2;
    }
}
