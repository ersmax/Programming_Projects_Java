package Projects_set2.Project_14_Lethal_Caffeine_File_Console;

import java.util.Scanner;

/**
 * This program calculates the lethal dose of caffeine based on user input.
 * It reads the drink name and caffeine content from the console,
 * then computes and displays the number of drinks required to reach a lethal dose.
 * @author admin
 *
 */
public class Lethal_Caffeine_Console {

    private static final int LETHAL_GRAMS = 10;
    private static final double EPS = 1e-9;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Scanner parser;
        String drink, dummy;
        double gCaffeine, lethalDose;

        String line = keyboard.nextLine();
        keyboard.close();

        parser = new Scanner(line);
        // check input: coffee, 160
        if (line.contains(","))
            parser.useDelimiter(",");
        else
            parser.useDelimiter("\\s+");

        drink = parser.next().trim();
        dummy = parser.next().trim();
        parser.close();

        gCaffeine = Double.parseDouble(dummy);

        // Please read the alternative implementation in the README.md
        gCaffeine /= 1000;
        lethalDose = (double)LETHAL_GRAMS / gCaffeine;

        if (Math.abs(lethalDose - Math.round(lethalDose)) < EPS )
            lethalDose = Math.round(lethalDose);
        else
            lethalDose = Math.ceil(lethalDose);
        System.out.printf("The lethal dose of %s is %.0f", drink, lethalDose);

    }
}
