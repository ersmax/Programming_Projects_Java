# Math Operations

Write a program that reads in two numbers typed on the keyboard and divides
the first number by the second number. The program should output the dividend,
divisor, quotient, and remainder on the screen.

---

# Overview

Simple console program that reads two integers (dividend and divisor), 
computes and prints the dividend, divisor, quotient (formatted to two decimals) and remainder.

File: `src/Projects_set2/Project_03_Math_operations/MathOperations.java`

## Purpose
- Demonstrates safe console input in Java using `Scanner`.
- Shows basic integer division, remainder and formatted output with `DecimalFormat`.
- Handles invalid numeric input and division-by-zero at runtime.

## How it works 
- `main`:
    - Creates a `Scanner` for `System.in`.
    - Repeats: call `insertion` to read validated numbers, 
      call `display` to show results, then prompt the user whether to repeat.
    - Uses `keyboard.nextLine()` once to discard a leftover newline 
      before reading the repeat token with `keyboard.next()`.

- `insertion(Scanner keyboard)`:
    - Reads `dividend` with a loop that uses `keyboard.nextInt()`. 
      On `InputMismatchException` it calls `keyboard.nextLine()` 
      to discard the invalid input/line and prompts again.
    - Repeats the same pattern to read `divisor`.
    - Returns `new int[] { dividend, divisor }`.

- `display(int dividend, int divisor)`:
    - Uses `DecimalFormat("0.00")` to format numeric output.
    - Computes `quotient` as a `double` and `remainder` using the 
      `%` operator (stored as `double` in code and formatted to two decimals).
    - Catches `ArithmeticException` just in case of division by zero and prints an error message.

## Input handling details
- `Scanner.nextInt()` consumes the integer token but leaves the newline `'\n'` in the buffer. 
   The code uses `keyboard.nextLine()` to discard leftover newlines or invalid input lines.
- When a non-numeric token is entered, `nextInt()` throws `InputMismatchException`. 
  The `catch` calls `keyboard.nextLine()` to remove the invalid input before retrying.
- The repeat prompt reads the repeat answer with `keyboard.next()` 
  to avoid reading an empty string from a leftover newline.

## Output format
- Dividend and divisor are printed as integers.
- Quotient is printed with two decimals (e.g. `2.50`).
- Remainder is printed using the same `0.00` format 
  in the current code (though remainder is typically shown as an integer).

## Example run
```text
Enter dividend:
10
Enter divisor:
4
Divided: 10
Divisor: 4
2.50
2.00
Repeat? (y/Y)
n
```

## Build / Run (from project root on Windows)
- Compile:
    - `javac -d out src\Projects_set2\Project_03_Math_operations\MathOperations.java`
- Run (from project root, using package):
    - `java -cp out Projects_set2.Project_03_Math_operations.MathOperations`

## Notes / possible improvements
- The code prints the remainder formatted to two decimals. 
  If an integer remainder is desired, change the remainder type to `int` and print without `DecimalFormat`.
- The extra `keyboard.nextLine()` used to discard a newline 
  can be simplified by consistently using `next()` for single-token prompts and `nextLine()` for full-line input.