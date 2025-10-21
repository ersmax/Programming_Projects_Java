package Projects_set1.Project_03_Latin_name;


/**
 * This program prints a full name in pig latin format
 * @author admin
 *
 */
public class LatinName {

    public static final String PREFIX = "ay";

    /**
     * Main method
     * Precondtions: None
     * Postconditions: Prints the full name in pig latin format
     * @param args
     */
    public static void main(String[] args) {
        String name = "walt", surname = "savitch", fullNamePigLatin;

        fullNamePigLatin = name.substring(1, 2).toUpperCase()
                + name.substring(2)
                + name.substring(0, 1)
                + PREFIX
                + " "
                + surname.substring(1, 2).toUpperCase()
                + surname.substring(2)
                + surname.substring(0, 1)
                + PREFIX;

        System.out.println(fullNamePigLatin);
    }



}
