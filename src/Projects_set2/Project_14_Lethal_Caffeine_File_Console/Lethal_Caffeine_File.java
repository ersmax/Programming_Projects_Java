package Projects_set2.Project_14_Lethal_Caffeine_File_Console;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

public class Lethal_Caffeine_File {

    private static final String PATH =
            "src/Projects_set2/Project_14_Lethal_caffeine/Caffeine.txt";
    private static final int LETHAL_GRAMS = 10;
    private static final double EPS = 1e-9;

    public static void main(String[] args) {
        Vector<DrinkCaffeine> drinksList = new Vector<>();

        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream(PATH));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        while (fileIn.hasNextLine()) {
            String line = fileIn.nextLine();
            Scanner parser = new Scanner(line);

            if (line.contains(","))
                parser.useDelimiter(",");
            else
                parser.useDelimiter("\\s+");

            String drink = parser.next().trim();
            String dummy = parser.next().trim();

            double gCaffeine = Double.parseDouble(dummy);
            gCaffeine /= 1000;
            drinksList.add(new DrinkCaffeine(drink, gCaffeine));
            parser.close();
        }
        fileIn.close();

        for (DrinkCaffeine it : drinksList) {
            double lethalDose = (double)LETHAL_GRAMS / it.getCaffeineMg();
            if (Math.abs(lethalDose - Math.round(lethalDose)) < EPS)
                lethalDose = Math.round(lethalDose);
            else
                lethalDose = Math.ceil(lethalDose);

            System.out.printf("The lethal dose of %s is %.0f. %n", it.getDrink(), lethalDose);
        }

    }
}


