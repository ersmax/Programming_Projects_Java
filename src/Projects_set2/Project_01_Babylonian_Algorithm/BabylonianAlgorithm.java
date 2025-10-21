package Projects_set2.Project_01_Babylonian_Algorithm;

import java.util.Scanner;

/**
 * This class implements the Babylonian algorithm
 * to approximate the square root of a positive number.
 * @author admin
 */
public class BabylonianAlgorithm {

    public static final int ITERATIONS = 5;

    /**
     * Main method to execute the Babylonian algorithm for square root approximation.
     * Precondition: User inputs a positive integer.
     * Postcondition: Outputs the approximate square root of the input number.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number, idx = 0;
        double guess, r;

        do {
            System.out.print("Enter a positive number: ");
            number = keyboard.nextInt();
        } while (number <= 0);

        guess =  (double)number / 2.0;
        do {
            r = (double)number / guess;
            guess = (guess + r) / 2;
            ++idx;
        } while (idx < ITERATIONS);

        System.out.printf("The approximate square root of %d is %5.2f.",
                            number, guess);
    }
}
