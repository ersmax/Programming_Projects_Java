package Projects_set1.Project_07_Time_conversion;

/**
 * This class converts seconds into hours, minutes, and seconds.
 */
public class Time_conversion {

    public static final int SECONDS = 50391;

    /**
     * Main method
     * Precondition: none
     * Postcondition: prints the number of hours, minutes, and seconds that corresponds to SECONDS
     * @param args
     */
    public static void main(String[] args) {
        int secondsLeft = SECONDS, hours, minutes;

        hours = secondsLeft / (60 * 60);
        secondsLeft -= hours * 60 * 60;

        minutes = secondsLeft / 60;
        secondsLeft -= minutes * 60;

        System.out.println(SECONDS + " corresponds to: "
                + hours + " hours, "
                + minutes + " minutes, "
                + secondsLeft + " seconds.");
        System.out.println("Which is as same as: "
                + SECONDS / 3600 + " hours, "
                + (SECONDS % 3600) / 60 + " minutes, "
                + (SECONDS % 3600) % 60 + " seconds.");
    }
}
