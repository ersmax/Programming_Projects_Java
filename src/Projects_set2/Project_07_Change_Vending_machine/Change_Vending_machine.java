package Projects_set2.Project_07_Change_Vending_machine;

import java.util.Scanner;

/**
 * This program calculates the change to be dispensed from a vending machine.
 * An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
 * increments (25, 30, 35, ..., 90, 95, or 100), and the machine accepts
 * only a single dollar bill to pay for the item.
 *
 * @author admin
 */
public class Change_Vending_machine {

    /**
     * This function checks if the price is valid
     * Precondition: price is an integer
     * Postcondition: returns true if price is between 25 and 100
     * and is multiple of 5, false otherwise
     *
     * @param price
     * @return boolean
     */
    private static boolean isValidPrice(int price) {
        return (price >= 25 && price <= 100 && price % 5 == 0);
    }

    /**
     * This function prints the non zero coins
     * Precondition: counts and labels are arrays of same length
     * Postcondition: prints the non zero coins
     *
     * @param counts
     * @param labels
     */
    private static void printNonZeroCoins(int[] counts, String[] labels) {
        for (int idx = 0; idx < counts.length; idx++) {
            if (counts[idx] != 0)
                System.out.printf("%d %s%n", counts[idx], labels[idx]);
        }
    }

    /**
     * Main method
     * Precondition: none
     * Postcondition: prints the change to be dispensed from a vending machine
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int remainder = 100;
        int price, fiftyCent, twentyCent, tenCent, fiveCent;

        String[] labels = {"fifty cents", "twenty cents", "ten cents", "five cents"};

        do {
            System.out.println("Enter the price (25-100): ");
            while (!keyboard.hasNextInt()) {
                keyboard.next();    // Discard invalid input
                System.out.println("Enter valid integer (25-100):");
            }
            price = keyboard.nextInt();
        } while (!isValidPrice(price));

        System.out.printf("You bought an item for %d cents%n" +
                          "and gave me an euro", price);

        remainder -= price;
        if (remainder == 0)
            System.out.printf(", no change.%n");
        else {

            System.out.printf(", so your change is%n");
            fiftyCent = remainder / 50;
            twentyCent = (remainder % 50) / 20;
            tenCent = ((remainder % 50) % 20) / 10;
            fiveCent = (((remainder % 50) % 20) % 10) / 5;

            int[] count = {fiftyCent, twentyCent, tenCent, fiveCent};
            printNonZeroCoins(count, labels);

            remainder -= fiftyCent * 50 + twentyCent * 20 + tenCent * 10 + fiveCent * 5;
            if (remainder != 0)
                throw new IllegalStateException("Changes left " + remainder);
        }

        keyboard.close();
    }
}
