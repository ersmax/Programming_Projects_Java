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

---
This project reads a text file of names and heights, 
computes a simple "ideal body weight" for each person, and prints a formatted report.

## Files
- `src/Projects_set2/Project_13_BMI_From_File/BMI_From_File.java` — main program that parses the file, computes weights, and prints results.
- `src/Projects_set2/Project_13_BMI_From_File/Person.java` — simple data class that stores a person's full name and height (feet + inches).

## Purpose
Estimate an "ideal body weight" using a simple rule:
- 110 pounds for the first 5 feet (60 inches).
- Add 5 pounds for each inch above 5 feet.

## `Person.java` (summary)
- Fields: `fullName` (String), `feet` (int), `inches` (int).
- Constructor: `Person(String fullName, int feet, int inches)`.
- Accessors: `getName()`, `getFeet()`, `getInches()`.
- Immutable: fields are `private final`.

## `BMI_From_File.java` (summary)
- Constants:
  - `FEET_POUNDS = 110` — base weight for first 5 feet.
  - `INCHES_POUNDS = 5` — pounds per extra inch.
  - `PATH` — path to `Names_BMI.txt`.
- Input parsing:
  - Uses `Scanner` to read the file.
  - Expects records of three lines: name, feet, inches. Blank name lines are skipped.
  - After reading numeric values with `nextInt()`, the code consumes the remainder of the line (`nextLine()`) to stay aligned with the file layout.
- Weight calculation:
  - `totalInches = feet * 12 + inches`
  - `extraInches = Math.max(0, totalInches - 5 * 12)` — clamps negative values to zero so people under 5 ft are not assigned less than the base weight.
  - `idealWeight = FEET_POUNDS + INCHES_POUNDS * extraInches`
- Output:
  - Each line printed as a left-aligned label and right-aligned weight, e.g.:
    - `System.out.printf("%-30s %3d lb%n", label, idealWeight);`
  - Label includes the person's name and the text `\`'s ideal weight:\``.
- Error handling:
  - If the file cannot be opened, prints `File not found.` and exits.
  - The parser tolerates blank name lines and stops gracefully if expected numeric tokens are missing.

## Edge cases & notes
- Heights below 5 ft are treated as 5 ft (no subtraction from the base weight) because of the `Math.max(0, ...)` clamp.
- The program assumes well-formed integer tokens for feet and inches; malformed numeric input will cause `InputMismatchException`.

## Example
Input (excerpt from `Names_BMI.txt`):
```
Tom Atto
6
3
Eaton Wright
5
5
Cary Oki
5
11
```
Sample output:
```
Tom Atto's ideal weight:          145 lb
Eaton Wright's ideal weight:      135 lb
Cary Oki's ideal weight:          145 lb
```