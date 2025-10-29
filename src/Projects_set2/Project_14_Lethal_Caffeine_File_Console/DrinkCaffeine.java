package Projects_set2.Project_14_Lethal_Caffeine_File_Console;

/** This class represents a drink with its name and caffeine content in milligrams.
 * It provides methods to access these attributes.
 * @author admin
 *
 */
public class DrinkCaffeine {
    private final String drink;
    private final double caffeineMg;

    public DrinkCaffeine(String drink, double caffeineMg) {
        this.drink = drink;
        this.caffeineMg = caffeineMg;
    }

    public String getDrink() {
        return drink;
    }

    public double getCaffeineMg() {
        return caffeineMg;
    }
}
