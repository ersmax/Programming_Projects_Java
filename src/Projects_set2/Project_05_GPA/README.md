# GPA Calculator

Grade point average (GPA) in a 4-point scale is calculated by using the following formula:
GPA = (Percentage / 100) * 4
Write a program that takes as input the percentage from a user. The program
should then output the user’s GPA on the screen. The format of the output should
be as follows, assuming the user’s percentage is 85:
(85/100) * 4 = 3

---

## Purpose
- Calculates GPA on a 4.0 scale from a percentage using the formula: GPA = (Percentage / 100) * 4.
- Reads an integer percentage from standard input and prints the formatted result.

## Output formatting
- If `result` is a whole number, prints with zero decimal places; otherwise prints with two decimal places.
- Output format: `(<percentage>/100) * 4 = <formattedGpa>`
- Example: input `85` -> `(85/100) * 4 = 3`

## Run and compile (from project root)
```bash
# compile
javac -d out src/Projects_set2/Project_05_GPA/GPA.java

# run
java -cp out Projects_set2.Project_05_GPA.GPA
```

## Suggested improvements
1. Add input validation and user-friendly error messages.
2. Accept non-integer percentages (use `double`) if fractional percentages are needed.
3. Add unit tests covering typical and edge inputs.