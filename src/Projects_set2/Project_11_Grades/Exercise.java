package Projects_set2.Project_11_Grades;

/** This class represents an exercise with a name, grade received, and maximum score.
 * It provides methods to access these attributes.
 * @author admin
 *
 */
public class Exercise {
    private final String nameExercise;
    private final int grade;
    private final int maxScore;

    public Exercise(String name, int grade, int maxScore) {
        this.nameExercise = name;
        this.grade = grade;
        this.maxScore = maxScore;
    }

    public String getNameExercise() {
        return nameExercise;
    }

    public int getGrade() {
        return grade;
    }

    public int getMaxScore() {
        return maxScore;
    }
}
