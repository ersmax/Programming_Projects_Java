/*
Body Mass Index (BMI) helps in specifying the weight category a person
belongs to, depending on their body weight. BMI is estimated using the following
formula:
BMI = (Weight in kilograms)/(Height in meters)^2
Write a program that calculates and outputs the BMI. Assume various input values
wherever required.
 */

package Projects_set1.Project_01_BMI;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight, height, BMI;
        Scanner input = new Scanner(System.in);

        System.out.println("Insert the weight and height: ");
        weight = input.nextFloat();
        height = input.nextFloat();

        BMI = (float) (weight / Math.pow(height, 2));
        System.out.println("The BMI is: "
                + BMI);
    }
}
