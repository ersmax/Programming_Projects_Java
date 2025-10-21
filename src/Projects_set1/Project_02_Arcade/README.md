The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next,
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.

---

## Overview
This program calculates the number of candy bars and gumballs that
can be redeemed using a given number of coupons from an arcade.
Candy bars are prioritized over gumballs, and any remaining coupons are displayed.

## Features
Defines the number of coupons available.
Calculates the maximum number of candy bars that can be redeemed.
Calculates the maximum number of gumballs that can be redeemed with the remaining coupons.
Outputs the results, including the remaining coupons.

## Code Explanation
Package Declaration: The program is part of the Projects_set1.Project_02_Arcade package.

## Constants:
CANDY_BAR_PRICE: The number of coupons required for one candy bar (10).
GUMBALL_PRICE: The number of coupons required for one gumball (3).

## Main Method:
Initializes the total number of coupons (numberCoupons).
Calculates the number of candy bars using integer division.
Calculates the remaining coupons after redeeming candy bars.
Calculates the number of gumballs using the remaining coupons.
Updates the remaining coupons after redeeming gumballs.

## Output:
Displays the number of candy bars, gumballs, and remaining coupons.

## How to Run
Compile the program using javac Arcade.java.
Run the program using java Projects_set1.Project_02_Arcade.Arcade.
The program will display the results based on the predefined number of coupons.

## Assumptions
The number of coupons is a positive integer.
Candy bars are prioritized over gumballs.

## Limitations
The program does not handle invalid input (e.g., non-integer or negative values for coupons).
The number of coupons is hardcoded and not user-input.

## Enhancements
Allow user input for the number of coupons.
Add input validation to handle invalid or negative values.
