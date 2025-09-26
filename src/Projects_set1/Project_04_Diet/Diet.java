/*
A government research lab has concluded that an artificial sweetener commonly
used in diet soda pop will cause death in laboratory mice. A friend of yours is
desperate to lose weight but cannot give up soda pop. Your friend wants to know
how much diet soda pop it is possible to drink without dying as a result. Write a
program to supply the answer. The program has no input but does have defined
constants for the following items: the amount of artificial sweetener needed to kill
a mouse, the weight of the mouse, the starting weight of the dieter, and the desired
weight of the dieter. To ensure the safety of your friend, be sure the program uses
the weight at which the dieter will stop dieting, rather than the dieter’s current
weight, to calculate how much soda pop the dieter can safely drink. You may use
any reasonable values for these defined constants. Assume that diet soda contains
1/10th of 1% artificial sweetener. Use another named constant for this fraction.
You may want to express the percent as the double value 0.001. (If your program
turns out not to use a defined constant, you may remove that defined constant
from your program.)
 */

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
