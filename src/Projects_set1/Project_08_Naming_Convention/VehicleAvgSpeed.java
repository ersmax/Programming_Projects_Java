package Projects_set1.Project_08_Naming_Convention;

/**
 * This program calculates vehicle average speed given a time and distance traveled.
 * @author admin
 */
public class VehicleAvgSpeed {
    public static final double DISTANCE = 180.0;

    /**
     * Main method
     * Precondition: none
     * Postcondition: prints the average speed of a vehicle given a time and distance traveled
     * @param args
     */
    public static void main(String[] args) {
        double time = 20.5;
        double averageSpeed = DISTANCE / time;

        System.out.println("This program calculates vehicle " +
                "average speed given a time and distance traveled.");
        System.out.println("Car average speed is "
                + averageSpeed
                + " miles per hour.");
    }
}
