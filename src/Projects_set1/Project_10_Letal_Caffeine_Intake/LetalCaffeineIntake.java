/*
Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose. Write a program with a variable that holds the number of milligrams
of caffeine in a drink and outputs how many drinks it takes to kill a person.
A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.
 */


package Projects_set1.Project_10_Letal_Caffeine_Intake;

public class LetalCaffeineIntake {

    public static final int LETHAL_CAFFEINE = 10000;

    public static void main(String[] args) {
        int drinkCaffeine = 34, lethalsNumberDrinks;

        lethalsNumberDrinks = LETHAL_CAFFEINE / drinkCaffeine;

        if (LETHAL_CAFFEINE / (double)drinkCaffeine > lethalsNumberDrinks) {
            lethalsNumberDrinks += 1;
        }
        System.out.println("Number of fatal drinks (with "
                            + LETHAL_CAFFEINE/1000.0
                            + " grams of caffeine each): "
                            + lethalsNumberDrinks);
        System.out.println("This is equivalent to (using Math.ceil): "
                            + (int)Math.ceil(LETHAL_CAFFEINE/(double)drinkCaffeine));
    }
}
