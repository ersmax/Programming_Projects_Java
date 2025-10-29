package Projects_set2.Project_13_BMI_From_File;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

/** * This program reads names and heights from a file and calculates the ideal body weight for each person.
 * The ideal body weight is calculated as 110 pounds for the first 5 feet of height and 5 pounds for each additional inch.
 * It then outputs the full name and ideal body weight for each person.
 * @author admin
 *
 */
public class BMI_From_File {

    private static final String PATH =
            "src/Projects_set2/Project_13_BMI_From_File/Names_BMI.txt";

    private static final int FEET_POUNDS = 110;
    private static final int INCHES_POUNDS = 5;

    public static void main(String[] args) {
        Scanner fileIn = null;
        String name;
        int feet, inches;
        Vector<Person> peopleHeight = new Vector<>();

        try {
            fileIn = new Scanner(new FileInputStream(PATH));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        while (fileIn.hasNextLine()) {
            name = fileIn.nextLine().trim();
            if (name.isEmpty()) continue;

            if (!fileIn.hasNextLine()) break;
            feet = fileIn.nextInt();
            fileIn.nextLine();  // move to next line

            if (!fileIn.hasNextLine()) break;
            inches = fileIn.nextInt();
            if (fileIn.hasNextLine())
                fileIn.nextLine();  // move to next line

            peopleHeight.add(new Person(name, feet, inches));
        }

        for (Person it : peopleHeight) {
            int totalInches = it.getFeet() * 12 + it.getInches();
            int extraInches = Math.max(0, totalInches - 5 * 12);
            int BMI = FEET_POUNDS + INCHES_POUNDS * extraInches;

            String label = it.getName() + "'s ideal weight:";
            System.out.printf("%-30s %3d lb%n", label, BMI);
        }

        // System.out.print("Text left to read? ");
        // System.out.println(fileIn.hasNextLine());
        fileIn.close();
    }
}
