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

---
## Changes:
1. change naming of variable (TIME -> time)
2. change naming of class (VehicleAvgSpeed)
3. change naming of constant (distance -> DISTANCE)
4. change naming of variable (AVERAGE_SPEED -> averageSpeed)
5. formatting of code (indentation, spacing, line breaks)