package Projects_set2.Project_03_Math_operations;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;


/** * This program prompts the user to input a dividend and a divisor,
 * performs division and modulus operations, and displays the results
 * formatted to two decimal places. It handles invalid inputs and division
 * by zero gracefully, allowing the user to repeat the process.
 *
 * @version 1.0
 * @author admin
 */
public class MathOperations {

    /** The main method to run the MathOperations program.
     * It handles user input and controls the flow of the program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dividend, divisor;
        String answer;

        do {
            int[] values = insertion(keyboard);
            dividend = values[0];
            divisor = values[1];

            display(dividend, divisor);

            String dummy = keyboard.nextLine(); // Discard \n
            System.out.println("Repeat? (y/Y)");
            answer = keyboard.next();
        } while (answer.equalsIgnoreCase("y"));

        keyboard.close();
    }

    /** Prompts the user to input a dividend and a divisor,
     * ensuring valid integer inputs.
     *
     * @param keyboard Scanner object for user input.
     * @return An array containing the dividend and divisor.
     */
    public static int[] insertion(Scanner keyboard) {
        int dividend, divisor;

        while (true) {
            System.out.println("Enter dividend:");
            try {
                dividend = keyboard.nextInt();
                break;
            } catch (InputMismatchException e) {
                String dummy = keyboard.nextLine(); // empty the read buffer
                System.out.println("Invalid number. Retry");
            }
        }

        while (true) {
            System.out.println("Enter divisor:");
            try {
                divisor = keyboard.nextInt();
                break;
            } catch (InputMismatchException e) {
                String dummy = keyboard.nextLine(); // empty the read buffer
                System.out.println("Invalid number. Retry");
            }
        }
        return new int[] {dividend, divisor};
    }

    /** Performs division and modulus operations on the given
     * dividend and divisor, displaying the results formatted
     * to two decimal places. Handles division by zero.
     *
     * @param dividend The dividend for the division operation.
     * @param divisor The divisor for the division operation.
     */
    public static void display(int dividend, int divisor) {
        DecimalFormat pattern0dot00 = new DecimalFormat("0.00");
        double quotient, remainder;

        System.out.println("Divided: " + dividend);
        System.out.println("Divisor: " + divisor);
        try {
            quotient = (double)dividend / (double)divisor;
            remainder = dividend % divisor;
            System.out.println(pattern0dot00.format(quotient));
            System.out.println(pattern0dot00.format(remainder));
        } catch (ArithmeticException e)
        {
            System.out.println("Error: Division by zero.");
            System.out.println("Details: " + e.getMessage());
        }
    }
}
