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
