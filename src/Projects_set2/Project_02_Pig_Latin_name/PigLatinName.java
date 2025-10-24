package Projects_set2.Project_02_Pig_Latin_name;

import java.util.Scanner;


public class PigLatinName {

    public static final String PREFIX = "ay";

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
