# Artificial Sweetener Calculator

(This is a better version of an exercise from Chapter 1.) A government research lab
has concluded that an artificial sweetener commonly used in diet soda pop causes
death in laboratory mice. A friend of yours is desperate to lose weight but cannot
give up soda pop. Your friend wants to know how much diet soda pop it is possible
to drink without dying as a result. Write a program to supply the answer. The
input to the program is the amount of artificial sweetener needed to kill a mouse,
the weight of the mouse, and the desired weight of the dieter. Assume that diet
soda contains 1/10th of 1% artificial sweetener. Use a named constant for this
fraction. You may want to express the percent as the double value 0.001.

---
## Description
This program computes the maximum number of diet sodas a person can safely drink based 
on the lethal dose of an artificial sweetener for mice and the person's weight. 
Diet soda is assumed to contain 1/10th of 1% artificial sweetener (0.001).

## Inputs
- First prompt: two numbers — the weight of the mouse (double) and the amount of artificial 
  sweetener required to kill that mouse (double).
- Second prompt: one number — the weight of the person (double).

All values must be positive.

## Notes
- The program makes use of EPS to handle floating-point comparisons.
- It subtracts 1 from the final result in case of division without remainder to ensure 
  the person does not exceed the lethal dose.
- It makes use of Math.round and Math.floor to ensure correct rounding and flooring of results.

## Usage
From the project root:

```bash
javac -d out src/Projects_set2/Project_06_Artificial_Sweetner/Artificial_Sweetner.java
java -cp out Projects_set2.Project_06_Artificial_Sweetner.Artificial_Sweetner
```

## Example
Input:
```
Enter the weight of mouse,
and the amount of lethal sweetener: 35 0.01
Enter the weight of the person: 70
```
Output:
```
You can safely drink X soda(s).
```