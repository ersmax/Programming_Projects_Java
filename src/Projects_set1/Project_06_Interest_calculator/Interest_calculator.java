package Projects_set1.Project_06_Interest_calculator;

/**
 * This program calculates the simple interest on a loan
 * @author admin
 */
public class Interest_calculator {

    public static final float AMOUNT = 1000,
            INTEREST_RATE = 5.0F;
    public static final int NUMBER_YEARS = 5;

    /**
     * Main method
     * Precondition: none
     * Postcondition: prints the simple interest on a loan
     * @param args
     */
    public static void main(String[] args) {
        float simpleInterest = AMOUNT * (INTEREST_RATE / 100.0F) * NUMBER_YEARS;
        System.out.println(simpleInterest);

    }
}
