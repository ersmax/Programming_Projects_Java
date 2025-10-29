package Projects_set2.Project_13_BMI_From_File;

/** This class represents a person with a full name and height in feet and inches.
 * It provides methods to access these attributes.
 * @author admin
 *
 */
public class Person {
    private final String fullName;
    private final int feet;
    private final int inches;

    public Person(String fullName, int feet, int inches) {
        this.fullName = fullName;
        this.feet = feet;
        this.inches = inches;
    }

    public String getName() {return fullName;}

    public int getFeet() {return feet;}

    public int getInches() {return inches;}
}
