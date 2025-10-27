package Projects_set2.Project_05_GPA;

import java.util.Scanner;

/**
 * This program calculates GPA from percentage
 * using the formula: GPA = (Percentage / 100) * 4
 *
 * @author admin
 */
public class GPA {

    /**
     * Main method
     * Precondition: none
     * Postcondition: prints the GPA calculated from user input percentage
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String format;
        int percentage;
        double result;

        System.out.print("Enter the percentage:");
        percentage = keyboard.nextInt();
        result = (percentage / (double)100) * 4;

        if (result % 1 == 0) format = String.format("%.0f", result);
        else format = String.format("%.2f", result);

        System.out.printf("(%d/100) * 4 = %s%n", percentage, format);
    }
}
