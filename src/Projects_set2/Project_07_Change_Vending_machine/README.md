Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts
only a single
dollar bill to pay for the item. For example, a possible sample dialogue might be
the following:
Enter price of item
(from 25 cents to a dollar, in 5-cent increments):
45
You bought an item for 45 cents and gave me a dollar,
so your change is
2 quarters,
0 dimes, and
1 nickels.

---

# Change Vending Machine

This program computes the change to be dispensed from a vending machine 
when a customer pays with a single dollar bill. An item may cost between 25 and 100 cents, 
in 5\-cent increments (25, 30, 35, ..., 95, 100).

## Description
Reads an item price from standard input (integer cents). 
Valid prices are 25..100 inclusive and must be multiples of 5. 
The program prints either `no change.` (when price is 100) 
or the non\-zero counts of coins needed in the denominations: 50, 20, 10, and 5 cents.

## Inputs
- Prompt 1: one integer price (cents)
  - Must be between 25 and 100 (inclusive)
  - Must be a multiple of 5
- Non\-integer or out\-of\-range input is rejected and the program re\-prompts.

## Output
- Prints a purchase line:
  - `You bought an item for <price> cents and gave me a dollar,`
- Then either:
  - `no change.` (if price == 100)  
  or
  - `so your change is` followed by one line per non\-zero coin, e.g.
    ```
    1 fifty cents
    1 five cents
    ```

## Example
Input:
```
45
```
Output:
```
You bought an item for 45 cents
and gave me a dollar, so your change is
1 fifty cents
1 five cents
```

## Usage (from project root, Windows)
Compile:
```bash
javac -d out src/Projects_set2/Project_07_Change_Vending_machine/Change_Vending_machine.java
```
Run:
```bash
java -cp out Projects_set2.Project_07_Change_Vending_machine.Change_Vending_machine
```

## Notes and edge cases
- If the computed change leaves any leftover cents, the program throws an `IllegalStateException` 
  (internal consistency check).
- The program prints only non\-zero coin counts. 
- Input is re\-requested until valid; non\-numeric tokens are discarded.
```