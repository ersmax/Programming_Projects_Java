package Projects_set1.Project_02_Arcade;

/**
 * This program calculates how many candy bars and gumballs can be obtained
 * with a given number of coupons, prioritizing candy bars first.
 *
 * @author admin
 * @version 1.0
 */
public class Arcade {
    public static final int CANDY_BAR_PRICE = 10, GUMBALL_PRICE = 3;

    /**
     * Main method
     * Precondtions: None
     * Postconditions: Prints the number of candy bars and gumballs that can be
     * obtained with a given number of coupons, prioritizing candy bars first.
     * @param args
     */
    public static void main(String[] args) {
        int numberCoupons = 105, candyBars, gumBalls;
        int couponsRemaining;

        candyBars = numberCoupons / CANDY_BAR_PRICE;
        couponsRemaining = numberCoupons % CANDY_BAR_PRICE;

        gumBalls = couponsRemaining / GUMBALL_PRICE;
        couponsRemaining %= GUMBALL_PRICE;

        System.out.println("For "
                + numberCoupons
                + " coupons, you can get:\n"
                + candyBars + " candy bars;\n"
                + gumBalls + " gumballs.\n"
                + "Remaining tickets: " + couponsRemaining);
    }
}
