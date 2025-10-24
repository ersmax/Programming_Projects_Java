package Projects_set2.Project_04_Time_travel;

import java.util.Scanner;

public class TimeTravel {
    public static void main(String[] args) {
        double distance, speed;
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.print("Enter the distance: ");
            if (!keyboard.hasNextDouble()) {
                System.out.println("Invalid distance. Enter a value.");
                return;
            }
            distance = keyboard.nextDouble();

            System.out.print("Enter the speed: ");
            if (!keyboard.hasNextDouble()) {
                System.out.println("Invalid speed. Enter a value.");
                return;
            }

            speed = keyboard.nextDouble();
            if (speed < 0) {
                System.out.println("Speed must be greater or equal than 0");
                return;
            }

            try {
                if (speed == 0) throw new ArithmeticException("Speed cannot be zero");

                double totalHours = distance / speed;
                int hours, minutes;

                hours = (int)totalHours;
                minutes =  (int) Math.round((totalHours - hours) * 60);
                if (minutes == 60) {
                    hours++;
                    minutes = 0;
                }

                System.out.printf("Time for %.2f km and %.2f kkm/h: %d hours, %d minutes %n",
                        distance, speed, hours, minutes);

            } catch (ArithmeticException e)
            {
                System.out.print("Maybe too much time: ");
                System.out.println(e.getMessage());
            }


        } finally {
            keyboard.close();
        }
    }
}
