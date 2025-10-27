package Projects_set2.Project_06_Artificial_Sweetner;

import java.util.Scanner;

/**
 * This program calculates the maximum number of diet sodas a person can safely drink
 * based on the lethal dose of artificial sweetener for mice and the person's weight.
 * It uses a constant to represent the concentration of artificial sweetener in diet soda.
 */
public class Artificial_Sweetner {

    public static final double ARTIFICIAL_SWEETENER = 0.001;
    public static final double EPS = 1e-9;

    /**
     * Main method
     * Precondition: the weight of the mouse, the lethal amount of sweetener for the mouse,
     * and the weight of the person are provided as positive numbers.
     * Postcondition: Calculates and prints the maximum number of diet sodas
     * a person can safely drink without reaching a lethal dose of artificial sweetener.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double lethalQuantityHuman, weightHuman, sweetenerMouse, weightMouse,
               maxDrinks;
        int drinksAllowed;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the weight of mouse,\n" +
                         "and the amount of lethal sweetener: ");
        weightMouse = keyboard.nextDouble();
        sweetenerMouse = keyboard.nextDouble();
        System.out.print("Enter the weight of the person: ");
        weightHuman = keyboard.nextDouble();


        lethalQuantityHuman = (weightHuman * sweetenerMouse) / weightMouse;
        maxDrinks = lethalQuantityHuman / ARTIFICIAL_SWEETENER;

        // if (maxDrinks - (int)maxDrinks == 0) // is less precise
        if (Math.abs(maxDrinks - Math.round(maxDrinks)) < EPS)
            drinksAllowed = (int) Math.round(maxDrinks) - 1;
        else
            drinksAllowed = (int) Math.floor(maxDrinks);

        System.out.printf("You can safely drink %d soda(s).%n", drinksAllowed);
        keyboard.close();
    }

}
