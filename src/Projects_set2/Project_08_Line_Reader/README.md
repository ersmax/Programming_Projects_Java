Write a program that reads in a string containing three words separated by commas
and then outputs that string with each word in a different line.

---

# Short description
This program reads a single line from standard input that contains three words separated by commas 
and prints each word on its own line.

## Files
`src/Projects_set2/Project_08_Line_Reader/Line_Reader.java` - main program implementation.  
`src/Projects_set2/Project_08_Line_Reader/README.md` - this documentation.

## Usage
1. Compile:
```bash
javac -d out src/Projects_set2/Project_08_Line_Reader/Line_Reader.java
```
2. Run (from project root):
```bash
java -cp out Projects_set2.Project_08_Line_Reader.Line_Reader
```
In IntelliJ IDEA open the project and run the `Line_Reader` class.

## Input format
1. The program expects a single input line containing exactly three words separated by commas 
   (for example: `apple, banana, cherry`).
2. Spaces around words are trimmed by the program.

## Preconditions and behavior
1. The input must contain exactly three comma-separated items.
2. The last word must not be followed by an extra comma.
3. If the input does not meet these preconditions the program may throw an exception or produce incorrect output 
   (current implementation does not perform explicit validation).

## Example
Input:
```
apple, banana, cherry
```
Output:
```
Word 1: apple
Word 2: banana
Word 3: cherry
```

## Notes
1. The current implementation uses `Scanner` to parse the input line and trims each token.
2. To make the program more robust consider validating token count and handling missing or extra tokens explicitly.
```