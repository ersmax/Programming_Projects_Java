/*
Write a program that inputs the name, quantity, and price of three items. The
name may contain spaces. Output a bill with a tax rate of 6.25%. All prices should
be output to two decimal places. The bill should be formatted in columns with
30 characters for the name, 10 characters for the quantity, 10 characters for the
price, and 10 characters for the total. Sample input and output are shown as follows:
Input name of item 1:
lollipops
Input quantity of item 1:
10
Input price of item 1:
0.50
Input name of item 2:
diet soda
Input quantity of item 2:
3
Input price of item 2:
1.25
Input name of item 3:
chocolate bar
Input quantity of item 3:
20
Input price of item 3:
0.75
Your bill:
| Item           | Quantity | Price | Total |
|:---------------|--------:|-----:|-----:|
| lollipops      |      10 |  0.50 |  5.00 |
| diet soda      |       3 |  1.25 |  3.75 |
| chocolate bar  |      20 |  0.75 | 15.00 |
| Subtotal       |         |       | 23.75 |
| 6.25\% sales tax |       |       |  1.48 |
| Total          |         |       | 25.23 |
 */

package Projects_set2.Project_10_Bill_Format;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Vector;

public class Bill_Format {

    public static final int IT = 3;
    public static final double TAX_RATE = 0.0625;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int quantity;
        double price, subtotal = 0, tax, total;
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
        Vector<Item> items = new Vector<>();

        for (int idx = 1; idx <= IT; ++idx) {
            System.out.println("Input name of item " + idx + ":") ;
            name = keyboard.nextLine().trim();
            System.out.println("Input quantity of item " + idx + ":") ;
            quantity = keyboard.nextInt();
            System.out.println("Input price of item " + idx + ":") ;
            price = keyboard.nextDouble();
            String dummy = keyboard.nextLine();

            items.add(new Item(name, quantity, price));
        }

        for (Item iterator : items)
            subtotal += iterator.getTotal();

        tax = (subtotal * TAX_RATE);
        total = subtotal + tax;

        System.out.println("Your bill:");
        System.out.println();
        System.out.printf("%-30s%-10s%-10s%-10s%n",
                          "Item", "Quantity","Price", "Total");
        for (Item iterator : items) {
            System.out.printf("%-30s%-10d%-10.2f%-10.2f%n",
                               iterator.getName(),
                               iterator.getQuantity(),
                               iterator.getPrice(),
                               iterator.getTotal());
        }
        System.out.printf("%-30s%-10s%-10s%-10.2f%n",
                           "Subtotal","", "", subtotal);
        System.out.printf("%-30s%-10s%-10s%-10.2f%n",
                           TAX_RATE*100+"% sales tax",
                           "", "", tax);
        System.out.printf("%-30s%-10s%-10s%-10.2f%n",
                          "Total", "", "", total);

    }
}
