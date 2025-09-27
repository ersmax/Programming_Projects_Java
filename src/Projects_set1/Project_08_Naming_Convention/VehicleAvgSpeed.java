
package Projects_set1.Project_08_Naming_Convention;
    /*
    The following program will compile and run, but it uses poor programming style.
            Modify the program so that it uses the spelling conventions, constant naming
            conventions, and formatting style recommended in this book.
    public class vehicleAvgSpeed {
        public static void main(String[] args)
        {
            double TIME;
            System.out.println("This program calculates vehicle average speed
                    given a time and distance traveled.");
                    TIME = 20.5;
            AVERAGE_SPEED = distance / TIME;
            System.out.println("Car average speed is " + AVERAGE_SPEED
                    + " miles per hour.");
        }
        public static final double distance = 180;
    }
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
