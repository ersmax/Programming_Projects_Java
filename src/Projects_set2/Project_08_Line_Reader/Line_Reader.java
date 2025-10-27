package Projects_set2.Project_08_Line_Reader;

import java.util.Scanner;

/**
 * This program reads a line of input containing three words separated by commas
 * and outputs each word on a separate line.
 */
public class Line_Reader {
    /**
     * Main method
     * Precondition: The last word in the input line is not followed by a comma.
     * The string contains exactly three words separated by commas.
     * Postcondition: prints each of the three words from the input line on a separate line
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        String word1, word2, word3, line;
        Scanner keyboard = new Scanner(System.in);
        Scanner parser;

        System.out.println("Enter new line:");
        line = keyboard.nextLine();
        parser = new Scanner(line);

        parser.useDelimiter(",");
        word1 = parser.next().trim();
        word2 = parser.next().trim();
        word3 = parser.next().trim();

        System.out.printf("Word 1: %s%nWord 2: %s%nWord 3: %s%n",
                            word1, word2, word3);
    }
}
