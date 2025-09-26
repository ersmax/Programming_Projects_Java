/*
The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next,
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.
 */


package Projects_set1.Project_02_Arcade;




public class Arcade {
    public static final int CANDY_BAR_PRICE = 10, GUMBALL_PRICE = 3;

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
