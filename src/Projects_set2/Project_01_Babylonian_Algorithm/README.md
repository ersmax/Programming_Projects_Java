The Babylonian algorithm to compute the square root of a positive number n is as
follows:
1. Make a guess at the answer (you can pick n/2 as your initial guess).
2. Compute r = n / guess
3. Set guess = (guess +r)/ 2
4. Go back to step 2 for as many iterations as necessary. The more you repeat steps
   2 and 3, the closer guess will become to the square root of n.
   Write a program that inputs a double for n, iterates through the Babylonian algorithm
   five times, and outputs the answer as a double to two decimal places. Your
   answer will be most accurate for small values of n.

---

# Babylonian Algorithm for Square Root Approximation

This project implements the Babylonian algorithm to approximate the square root of a positive number using Java.

## How It Works

The Babylonian algorithm is an iterative method for finding the square root of a number `n`:

1. Start with an initial guess (n / 2).
2. Compute `r = n / guess`.
3. Update the guess: `guess = (guess + r) / 2`.
4. Repeat steps 2 and 3 for a fixed number of iterations (5 in this program).

The more iterations performed, the closer the guess will be to the actual square root.

## Usage

- The program prompts the user to enter a positive number.
- It validates the input to ensure it is positive.
- It performs five iterations of the Babylonian algorithm.
- The result is displayed to two decimal places.

## Example Output

```
Enter a positive number: 25
The approximate square root of 25 is 5.00.
```

## File Structure

- `BabylonianAlgorithm.java`: Contains the main logic for the Babylonian algorithm.
