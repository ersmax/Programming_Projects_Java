package Projects_set2.Project_11_Grades;

import java.util.Scanner;
import java.util.Vector;
import java.text.DecimalFormat;

/**
 * This program calculates the total grade for three classroom exercises as a percentage.
 * It summarizes the scores in a table and formats the percentage output.
 * @author admin
 *
 */
public class Grades {

    public static final int ASSIGNMENTS = 3;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat percentPattern = new DecimalFormat("#0.00%");
        String nameAssignment;
        int score, totalPoints;
        int currentTotScore = 0, totalMaxScore = 0;
        double totScorePercent;
        Vector<Exercise> exercise = new Vector<>();

        try (keyboard) {
            for (int idx = 1; idx <= ASSIGNMENTS; ++idx) {
                System.out.println("Name of exercise " + idx + ":");
                nameAssignment = keyboard.nextLine().trim();
                System.out.println("Score received for exercise " + idx + ":");
                score = keyboard.nextInt();
                System.out.println("Total points possible for exercise " + idx + ": ");
                totalPoints = keyboard.nextInt();
                String dummy = keyboard.nextLine(); // consume \n

                currentTotScore += score;
                totalMaxScore += totalPoints;
                exercise.add(new Exercise(nameAssignment, score, totalPoints));
            }
        }

        totScorePercent = (totalMaxScore == 0) ? 0.0 : (double)currentTotScore / (double)totalMaxScore;
        System.out.printf("%-30s%-10s%-10s%n", "Exercise", "Score", "Total Possible");
        for (Exercise iterator : exercise)
            System.out.printf("%-30s%-10d%-10d%n",
                               iterator.getNameExercise(),
                               iterator.getGrade(),
                               iterator.getMaxScore());
        System.out.printf("%-30s%-10d%-10d%n", "Total", currentTotScore, totalMaxScore);

        String totScorePercentLabel = percentPattern.format(totScorePercent);
        System.out.printf("Your total is %d out of %d, or %s.%n",
                           currentTotScore,
                           totalMaxScore,
                           totScorePercentLabel);

    }
}
