/*
Write a program for calculating the simple interest on a loan when the initial principal
amount (princi_amnt) is $1000, the initial interest rate (int_rate) is 5.0%,
and the number of years (no_of_yrs) is 5. Use suitable data types to declare these
variables. Simple interest is calculated using the following equation:
Simple interest = (Principal amount * Interest rate * Number of years) / 100
 */


package Projects_set1.Project_06_Interest_calculator;

/**
 * This class calculates the simple interest on a loan
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
