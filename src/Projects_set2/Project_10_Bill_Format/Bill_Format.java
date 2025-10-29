package Projects_set2.Project_10_Bill_Format;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;


/** * This program inputs the name, quantity, and price of three items
 * and outputs a formatted bill with tax calculation.
 * @author admin
 *
 */
public class Bill_Format {

    public static final int IT = 3;
    public static final double TAX_RATE = 0.0625;

    /**
     * Main method
     * Precondtions: None
     * Postconditions: Outputs a formatted bill with tax calculation
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int quantity;
        double price, subtotal = 0, tax, total;
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        Vector<Item> items = new Vector<>();

        for (int idx = 1; idx <= IT; ++idx) {
            System.out.println("Input name of item " + idx + ":") ;
            name = keyboard.nextLine().trim();
            System.out.println("Input quantity of item " + idx + ":") ;
            quantity = keyboard.nextInt();
            System.out.println("Input price of item " + idx + ":") ;
            price = keyboard.nextDouble();
            String dummy = keyboard.nextLine(); //

            items.add(new Item(name, quantity, price));
        }

        for (Item iterator : items)
            subtotal += iterator.getTotal();

        // round tax to cents to avoid floating points mistakes
        tax = Math.round(subtotal * TAX_RATE * 100.0) / 100.0;
        total = Math.round((subtotal + tax) * 100.0) / 100.0;

        System.out.println("Your bill:");
        System.out.println();
        System.out.printf("%-30s%-10s%-10s%-10s%n",
                          "Item", "Quantity","Price", "Total");
        for (Item iterator : items) {
            System.out.printf("%-30s%-10d%-10s%-10s%n",
                               iterator.getName(),
                               iterator.getQuantity(),
                               moneyFormatter.format(iterator.getPrice()),
                               moneyFormatter.format(iterator.getTotal()));
        }
        System.out.printf("%-30s%-10s%-10s%-10s%n",
                           "Subtotal","", "",
                            moneyFormatter.format(subtotal));

        String taxLabel = String.format("%.2f%% sales tax", TAX_RATE * 100);
        System.out.printf("%-30s%-10s%-10s%-10s%n",
                           taxLabel, "", "",
                           moneyFormatter.format(tax));
        System.out.printf("%-30s%-10s%-10s%-10s%n", "Total", "", "",
                           moneyFormatter.format(total));

    }
}
