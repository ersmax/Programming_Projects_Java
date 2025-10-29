/*
(This is an extension of an exercise from set 1.) A simple rule to estimate your
ideal body weight is to allow 110 pounds for the first 5 feet of height and 5 pounds
for each additional inch. Create the following text in a text file. It contains the names
and heights in feet and inches of Tom Atto (6’3”), Eaton Wright (5’5”), and Cary
Oki (5’11”):
Tom Atto
6
3
Eaton Wright
5
5
Cary Oki
5
11
Write a program that reads the data in the file and outputs the full name and ideal
body weight for each person. In the next chapter, you will learn about loops, which
allow for a more efficient way to solve this problem.
 */


package Projects_set2.Project_13_BMI_From_File;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BMI_From_File {

    private static final String PATH =
            "src/Projects_set2/Project_13_BMI_From_File/Names_BMI.txt";

    public static void main(String[] args) {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream(PATH));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }
    }
}
