A simple rule to estimate your ideal body weight is to allow 110 pounds for the first 5
feet of height and 5 pounds for each additional inch. Write a program with a variable
for the height of a person in feet and another variable for the additional inches. Assume
the person is at least 5 feet tall. For example, a person that is 6 feet and 3 inches tall
would be represented with a variable that stores the number 6 and another variable that
stores the number 3. Based on these values, calculate and output the ideal body weight.

---

# Ideal Body Weight Calculator

This Java program calculates the ideal body weight based on a person's height in feet and inches.

## How It Works

- The formula starts with a base weight of 110 pounds for the first 5 feet.
- For each additional inch over 5 feet, 5 pounds are added.
- For each additional foot over 5 feet, 60 pounds are added (since 12 inches \* 5 pounds = 60 pounds).
- The program validates that the height is between 5 and 7 feet, and inches are between 0 and 11.

## Usage

- Set the values of `heightFeet` and `heightInch` in the code.
- Run the program.
- The ideal body weight is printed if the input is valid; otherwise, an error message is shown.

## Example Output

```
Your ideal body weight is: 220
```

## File Structure

- `IdealBodyWeight.java`: Contains the main logic for the ideal body weight calculation.

