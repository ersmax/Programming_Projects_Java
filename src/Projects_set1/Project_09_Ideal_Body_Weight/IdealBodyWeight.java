package Projects_set1.Project_09_Ideal_Body_Weight;

/**
 * This class calculates the ideal body weight
 */
public class IdealBodyWeight {

    public static final int WEIGHT_PER_INCH = 5,
                            WEIGHT_BASE = 110;

    /**
     * Main method
     * Precondition: none
     * Postcondition: prints the ideal body weight
     * @param args
     */
    public static void main(String[] args) {

        int heightFeet = 7,
            heightInch = 10,
            idealBodyWeight;

        if ((heightFeet > 4 && heightFeet < 8)
            && (heightInch >=0 && heightInch < 12)) {

            idealBodyWeight = WEIGHT_BASE
                              + Math.max(heightFeet - 5, 0) * (WEIGHT_PER_INCH * 12)
                              + heightInch * WEIGHT_PER_INCH;
            System.out.println("Your ideal body weight is: "
                                + idealBodyWeight);
        } else {
            System.out.println("Wrong parameters.");
        }
    }
}
