/*
John travels a distance of 55 miles at an average speed of 15 miles per hour. Write
a program to calculate the total number of hours John takes to cover this distance.
The program should print the total time taken in hours and minutes. Use the following
formula for calculations.
Time = Distance / Speed
 */

package Projects_set2.Project_04_Time_travel;

import java.util.Scanner;

public class TimeTravel {
    public static void main(String[] args) {
        double distance, speed;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the distance: ");
        distance = keyboard.nextDouble();
        System.out.print("Enter the speed: ");
        speed = keyboard.nextDouble();

        try {
            if (speed == 0) throw new ArithmeticException("Speed cannot be zero");

            double result = distance / speed;
            System.out.printf("Time for %.2f km and %.2f kkm/h: %.2f %n",
                    distance, speed, result);
        } catch (ArithmeticException e)
        {
            System.out.print("Maybe too much time: ");
            System.out.println(e.getMessage());
        }

    }
}
