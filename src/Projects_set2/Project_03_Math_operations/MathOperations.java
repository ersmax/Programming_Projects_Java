/*
Write a program that reads in two numbers typed on the keyboard and divides
the first number by the second number. The program should output the dividend,
divisor, quotient, and remainder on the screen.
 */

package Projects_set2.Project_03_Math_operations;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MathOperations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat pattern0dot00 = new DecimalFormat("0.00");

        int dividend, divisor;
        double quotient, remainder;

        dividend = keyboard.nextInt();
        divisor = keyboard.nextInt();
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
