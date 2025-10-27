package Projects_set2.Project_09_Word_Replacement;

import java.util.Scanner;

/**
 * This program reads a line of text and replaces the first whole-word occurrence of "hate" with "love".
 * If "hate" is not found as a whole word, it notifies the user.
 * The whole word check ensures that "hate" is not part of another word (e.g., "unhateful").
 * Also, bound checks ensure that "hate" at the start or end of the line is correctly identified.
 */
public class Word_Replacement {

    public static final String REPLACED_WORD = "hate";
    public static final String REPLACING_WORD = "love";

    /**
     * Precondition: c is a character.
     * Postcondition:Checks if a character is a word character (letter, digit, or underscore).
     * @param c the character to check
     * @return true if the character is a word character, false otherwise
     */
    private static boolean isWordChar(char c) {
        return Character.isLetterOrDigit(c) || c == '_';
    }

    /**
     * Main method
     * Precondition: none
     * Postcondition: prints the modified line with the first whole-word occurrence of "hate" replaced by "love"
     * or notifies if "hate" is not found as a whole word.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        String starting, ending;
        String lower = line.toLowerCase();
        int position = lower.indexOf(REPLACED_WORD);

        // find first whole-word, e.g. no `unhateful` but `hate`
        while (position != -1) {
            int beforeIdx = position - 1;
            int afterIdx = position + REPLACED_WORD.length();

            boolean beforeSpace = (beforeIdx < 0 || !isWordChar(lower.charAt(beforeIdx)) );
            boolean afterSpace = (afterIdx == lower.length() || !isWordChar(lower.charAt(afterIdx)));
            if (beforeSpace && afterSpace)
                break;

            // start from the next character
            position = lower.indexOf(REPLACED_WORD.toLowerCase(), position + 1);
        }

        if (position == -1) {
            System.out.println("Word not found");
        } else {
            starting = line.substring(0, position);
            ending = line.substring(position + REPLACED_WORD.length());
            line = starting + REPLACING_WORD + ending;
            System.out.println(line);
        }
        keyboard.close();
    }
}
