Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose. Write a program with a variable that holds the number of milligrams
of caffeine in a drink and outputs how many drinks it takes to kill a person.
A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.

---

# Lethal Caffeine Intake Calculation

## Design Choices
1. Constant for Lethal Dose:
   - `LETHAL_CAFFEINE` is defined as a constant to represent the fixed lethal dose
      of caffeine (10,000 mg). This makes the code more maintainable.

2. Integer Division with Rounding:
   - The calculation of `lethalsNumberDrinks` uses integer division
     to determine the number of drinks required.
     A check is added to handle cases where the division results
     in a non-integer value, ensuring the result is rounded up.

3. Use of `Math.ceil`:
   - An alternative calculation using `Math.ceil` is included
     to demonstrate a cleaner and more concise way to round up the result.

4. Output Messages:
   - The program provides detailed output,
     including both the manual rounding result and the result using `Math.ceil`,
     for clarity and comparison.
