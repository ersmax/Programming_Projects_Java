package Projects_set2.Project_12_Text_Replacement_File;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/** * This program reads a line of text from a file and replaces the first whole-word occurrence of "hate" with "love".
 * If "hate" is not found as a whole word, it outputs the original line.
 * The whole word check ensures that "hate" is not part of another word (e.g., "unhateful").
 * Also, bound checks ensure that "hate" at the start or end of the line is correctly identified.
 * @author admin
 *
 */
public class Text_Replacement_File {

    private static final String PATH =
            "src/Projects_set2/Project_12_Text_Replacement_File/Example.txt";
    public static final String REPLACED = "hate";
    public static final String REPLACING = "love";


    private static boolean isSpace(char letter) {
        return (!Character.isLetterOrDigit(letter) && letter != '_');
    }


    public static void main(String[] args) {
        Scanner fileIn = null;
        String line;

        try {
            fileIn = new Scanner(new FileInputStream(PATH));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        while (fileIn.hasNextLine()) {
            line = fileIn.nextLine();
            String lower = line.toLowerCase();
            int position = lower.indexOf(REPLACED.toLowerCase());

            while (position != -1) {
                int idxBefore = position - 1;
                int idxAfter = position + REPLACED.length();
                boolean leftSpace = (idxBefore < 0 || isSpace(lower.charAt(idxBefore)));
                boolean rightSpace = (idxAfter == lower.length() || isSpace(lower.charAt(idxAfter)));

                if (leftSpace && rightSpace)
                    break;

                // start from the next character if any
                position = lower.indexOf(REPLACED.toLowerCase(), position + 1);
            }

            if (position == -1)
                System.out.println(line);
            else {
                String starting = line.substring(0,position);
                String ending = line.substring(position + REPLACED.length());
                String changed = starting + REPLACING + ending;
                System.out.println(changed);
            }
        }
        // System.out.print("Does file have next lines? ");
        // System.out.println(fileIn.hasNextLine());
        fileIn.close();
    }
}
