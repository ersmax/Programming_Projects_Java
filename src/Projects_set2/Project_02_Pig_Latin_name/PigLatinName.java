/*
(This is a version with input of an exercise from Set 1.) Write a program that
inputs two string variables, first and last, which the user should enter with his or
her name. First, convert both strings to all lowercase. Your program should then create
a new string that contains the full name in pig latin with the first letter capitalized
for the first and last name. Use only the pig latin rule of moving the first letter to the
end of the word and adding “ay.” Output the pig latin name to the screen. Use the
substring and toUpperCase methods to construct the new name.
For example, if the user inputs “Walt” for the first name and “Savitch” for the
last name, then the program should create a new string with the text “Altway
Avitchsay” and print it.
 */

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
