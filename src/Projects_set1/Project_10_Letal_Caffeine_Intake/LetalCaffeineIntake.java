package Projects_set1.Project_10_Letal_Caffeine_Intake;

/**
 * This program calculates the number of drinks required to reach a lethal caffeine intake.
 * Each drink contains a specified amount of caffeine (34 mg in this case).
 * It uses both integer division and Math.ceil to demonstrate the calculation.
 * @author admin
 */
public class LetalCaffeineIntake {

    public static final int LETHAL_CAFFEINE = 10000;

    /**
     * Main method to calculate and print the number of drinks for a lethal caffeine dose.
     * Precondition: None.
     * Postcondition: Prints the number of drinks that would result in a lethal caffeine dose.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int drinkCaffeine = 34, lethalsNumberDrinks;

        lethalsNumberDrinks = LETHAL_CAFFEINE / drinkCaffeine;

        if (LETHAL_CAFFEINE / (double)drinkCaffeine > lethalsNumberDrinks) {
            lethalsNumberDrinks += 1;
        }
        System.out.println("Number of fatal drinks (with "
                            + LETHAL_CAFFEINE/1000.0
                            + " grams of caffeine each): "
                            + lethalsNumberDrinks);
        System.out.println("This is equivalent to (using Math.ceil): "
                            + (int)Math.ceil(LETHAL_CAFFEINE/(double)drinkCaffeine));
    }
}
