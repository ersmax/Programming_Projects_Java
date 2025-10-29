/*
From Programming Project 10 in Chapter 1, scientists estimate that roughly 10
grams of caffeine consumed at one time is a lethal overdose. Write two programs
to compute how many drinks it takes to kill a person.
The first program should input the name of the drink and the number of
milligrams of caffeine in the drink. It should then output the drink name and the
number of drinks it takes to kill a person. For example, if the user enters “coffee”
and “160”, then the program should output “It will take approximately 62.5
drinks of coffee to kill a person from caffeine.”
The second program should perform the same calculation as the first program,
but read the name of the drink and the number of milligrams of caffeine in the
drink from a file named drink.txt and output the answer to the console.
 */


package Projects_set2.Project_14_Lethal_Caffeine_File_Console;

import java.util.Scanner;

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
        gCaffeine /= 1000;
        lethalDose = (double)LETHAL_GRAMS / gCaffeine;

        if (Math.abs(lethalDose - Math.round(lethalDose)) < EPS )
            lethalDose = Math.round(lethalDose);
        else
            lethalDose = Math.ceil(lethalDose);
        System.out.printf("The lethal dose of %s is %.0f", drink, lethalDose);

    }
}
