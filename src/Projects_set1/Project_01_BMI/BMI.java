package Projects_set1.Project_01_BMI;

import java.util.Scanner;

/**
 * This program calculates BMI
 * given weight and height
 *
 * @author admin
 */
public class BMI {

    /**
     * Precondition: None
     * Postcondition: This functions show BMI starting
     * from weigth and height
     * @param args
     */
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
