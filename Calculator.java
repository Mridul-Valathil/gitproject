/**
 * The Calculator class provides methods to perform basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer included by mridul
     * @return the sum of a and b
     */
    public int add(int a, int b, int c) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of a minus b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first int
     * @param b the second integer
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second. 
     * If the second integer is zero, throws an ArithmeticException.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    /**
     * Main method to run and test the Calculator class.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Perform basic arithmetic operations
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}