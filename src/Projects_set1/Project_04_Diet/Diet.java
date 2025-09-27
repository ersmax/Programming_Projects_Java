package Projects_set1.Project_04_Diet;

/*
 * This class calculates the safe quantity of diet soda pop in grams
 */
public class Diet {

    public static final int SWEETNER_TO_KILL_MOUSE = 5,
            WEIGHT_MOUSE = 2000,
            STARTING_WEIGHT = 70000,
            DESIRED_WEIGHT = 65000;
    public static final float PERCENTAGE_SWEETNER = 0.001F;

    /**
     * Main method
     * Precondition: none
     * Postcondition: prints the safe quantity of diet soda pop in grams
     * @param args
     */
    public static void main(String[] args) {
        float fatalGrams, safeDosage;

        fatalGrams = (DESIRED_WEIGHT * SWEETNER_TO_KILL_MOUSE) / (float)WEIGHT_MOUSE;
        safeDosage = fatalGrams / PERCENTAGE_SWEETNER;

        System.out.println("Safe quantity: "
                + safeDosage
                + " grams.");
    }
}
