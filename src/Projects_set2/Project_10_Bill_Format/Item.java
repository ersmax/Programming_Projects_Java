package Projects_set2.Project_10_Bill_Format;

/** This class represents an item with a name, quantity, and price.
 * It provides methods to access these attributes and calculate the total cost.
 * @author admin
 *
 */
public class Item {
    private final String name;
    private final int quantity;
    private final double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return (quantity * price);
    }
}
