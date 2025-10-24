# Time travel

John travels a distance of 55 miles at an average speed of 15 miles per hour. Write
a program to calculate the total number of hours John takes to cover this distance.
The program should print the total time taken in hours and minutes. Use the following
formula for calculations.
Time = Distance / Speed

---

## Overview
The program prints the result as hours and minutes. 
It validates input to ensure numeric values and a positive, non\-zero speed.

## Example
Input:
\`\`\`
Enter the distance (miles): 55
Enter the speed (mph): 15
\`\`\`

Output:
\`\`\`
Time for 55.00 miles at 15.00 mph: 3 hours, 40 minutes
\`\`\`

## Validation and behavior
- Non\-numeric distance or speed: program prints an "Invalid" message and exits.
- Speed \<= 0: program prints an error and exits (speed must be greater than zero).
- Minutes are rounded and normalized so 60 minutes become 1 additional hour.