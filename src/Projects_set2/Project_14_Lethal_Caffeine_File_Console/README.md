From Programming Project 10 in Chapter 1, scientists estimate that roughly 10
grams of caffeine consumed at one time is a lethal overdose. Write two programs
to compute how many drinks it takes to kill a person.
The first program should input the name of the drink and the number of
milligrams of caffeine in the drink. It should then output the drink name and the
number of drinks it takes to kill a person. For example, if the user enters “coffee”
and “160”, then the program should output “It will take approximately 62.5
drinks of coffee to kill a person from caffeine.”
The second program should perform the same calculation as the first program,
but read the name of the drink and the number of milligrams of caffeine in the
drink from a file named drink.txt and output the answer to the console.

---

# Lethal Caffeine — Console and File Versions

This project implements two small Java programs that compute how many drinks 
it would take to reach a lethal caffeine dose. Scientists estimate roughly 10 grams (10,000 mg) 
of caffeine consumed at one time is a lethal overdose. Each program uses the same calculation 
but differs in how it obtains input.

## Files of interest
- `Lethal_Caffeine_Console.java` — console input version
- `Lethal_Caffeine_File.java` — file input version
- `DrinkCaffeine.java` — simple data holder class
- (input file expected by the file version) `Caffeine.txt` (path configured by the `PATH` constant in `Lethal_Caffeine_File.java`)

## Shared logic
- Lethal dose constant: `LETHAL_GRAMS = 10` (grams).
- Input for each drink provides the caffeine content in milligrams (mg).
- Conversion: input mg → grams by dividing by `1000`.
- Calculation: number of drinks = `LETHAL_GRAMS / gramsPerDrink`.
- Rounding behavior:
  - If the computed value is effectively an integer (within a small EPS tolerance), the value is rounded to that integer.
  - Otherwise the result is rounded up using `Math.ceil` so the output is the minimum whole number of drinks required to reach or exceed the lethal dose.
- Output is printed to the console in a human-readable sentence (programs use `System.out.printf`).

## `DrinkCaffeine` class
- Purpose: simple immutable data holder representing one drink.
- Fields:
  - `String drink` — drink name.
  - `double caffeineMg` — caffeine amount (stored as grams in `Lethal_Caffeine_File` after conversion).
- Methods:
  - Constructor to initialize fields.
  - `getDrink()` and `getCaffeineMg()` getters.

## Console version — `Lethal_Caffeine_Console.java`
- Input:
  - Reads a single line from standard input.
  - Accepts either:
    - comma-separated format, e.g. `coffee, 160`
    - whitespace-separated format, e.g. `coffee 160`
- Parsing:
  - Uses a `Scanner` over the input line and sets delimiter to `","` when a comma is present, otherwise to whitespace.
  - The second token is parsed as milligrams (mg).
- Computation:
  - Converts mg → grams (`mg / 1000`), computes `LETHAL_GRAMS / gramsPerDrink`, then applies the rounding rules described above.
- Output:
  - Prints a single formatted sentence containing the drink name and the computed number of drinks.

Example:
- Input: `coffee, 160`
- Output: `The lethal dose of coffee is 63` (formatted as an integer after rounding rules).

## File version — `Lethal_Caffeine_File.java`
- Input:
  - Reads multiple lines from a file whose path is defined by the `PATH` constant (see source).
  - Each line should contain one drink entry in either comma-separated or whitespace-separated format (same as console version).
    - Example file lines: `coffee, 160` or `soda 45`
- Processing:
  - Reads each line, parses tokens, converts mg → grams, and creates a `DrinkCaffeine` instance for each entry (stored in a `Vector`).
  - After reading the file, iterates the list, computes the lethal number of drinks per entry using the same formula and rounding rules, and prints one line per drink.
- Error handling:
  - If the input file is not found, the program prints `File not found.` and exits.

Example `Caffeine.txt` contents:
```
coffee, 160
energy drink, 200
soda 45
```
Corresponding console output will contain one formatted line per entry.

## Notes and maintenance
- The file path used by `Lethal_Caffeine_File.java` is configured via the `PATH` constant; update it if your input file is located elsewhere or named differently (the original exercise mentions `drink.txt`).
- The programs currently accept a simple two-token line per drink. If you need to support drink names with internal commas or variable formatting, adjust the parsing logic accordingly.

## Alternatives
Instead of dividing mgCaffeine by 1000 and check if the result is an integer within a small tolerance EPS, 
one could multiply LETHAL_GRAMS (10gr) by 1000mg to work entirely in milligrams, avoiding floating-point division:
```java
lethalDose = LETHAL_GRAMS * 1000 / mgCaffeine;
if (LETHAL_GRAMS * 1000 % mgCaffeine == 0)
    lethalDose = LETHAL_GRAMS * 1000 / mgCaffeine;
else
    lethalDose = (LETHAL_GRAMS * 1000 / mgCaffeine) + 1;
```
This would yield the same result without needing to check for near-integer values.

For practice purposes, the current implementation demonstrates floating-point arithmetic and rounding techniques.