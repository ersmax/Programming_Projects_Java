package Projects_set2.Project_02_Pig_Latin_name;

import java.util.Scanner;

/**
 * Pig Latin Name Converter
 *
 * This program converts names into Pig Latin format.
 * The first letter of each name is moved to the end, followed by "ay".
 * The first letter of the resulting Pig Latin name is capitalized.
 *
 * Example:
 * Input: John Doe
 * Output: Ohnjay Oeday
 *
 * The program continues to prompt for new names until an empty line is entered.
 */
public class PigLatinName {

    public static final String PREFIX = "ay";

    /** Main method to run the Pig Latin name converter.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        System.out.println("New name? (enter to exit)");

        Scanner keyboard = new Scanner(System.in);

        String dummy, name, midnameSurname, namePig, midSurPig;

        while (keyboard.hasNextLine()) {
            dummy = keyboard.nextLine();

            if (dummy.trim().isEmpty())
                break;

            String[] tokens = dummy.trim().split("\\s+");
            if (tokens.length == 0)
                continue;

            name = tokens[0];
            namePig = toPigLatin(name);

            System.out.print(namePig);

            if (tokens.length > 1) {
                for (int idx = 1; idx < tokens.length; idx++) {
                    midnameSurname = tokens[idx];
                    midSurPig = toPigLatin(midnameSurname);
                    System.out.print(" " + midSurPig);
                }
            }
            System.out.println();
            System.out.println("New name? (enter to exit)");
        }
        keyboard.close();
    }

    /** Convert a word to Pig Latin format.
     *
     * @param word The input word to convert.
     * @return The Pig Latin version of the word.
     */
    public static String toPigLatin(String word) {
        if (word == null) return "";

        word = word.trim();
        if (word.isEmpty()) return "";

        if (word.length() == 1)
            return word.toUpperCase() + PREFIX;

        word = word.toLowerCase();
        word = word.substring(1)
                + word.charAt(0) + PREFIX;

        return (word.substring(0,1).toUpperCase() + word.substring(1));
    }
}
