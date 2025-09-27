/**
 * A simple rule to estimate your ideal body weight is to allow 110 pounds for the first 5
 * feet of height and 5 pounds for each additional inch. Write a program with a variable
 * for the height of a person in feet and another variable for the additional inches. Assume
 * the person is at least 5 feet tall. For example, a person that is 6 feet and 3 inches tall
 * would be represented with a variable that stores the number 6 and another variable that
 * stores the number 3. Based on these values, calculate and output the ideal body weight.
 */


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
