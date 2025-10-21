Write a program that starts with a line of text and then outputs that line of text
with the first occurrence of "hate" changed to "love". For example, a possible
sample output might be
The line of text to be changed is:
I hate you.
I have rephrased that line to read:
I love you.
You can assume that the word "hate" occurs in the input. If the word "hate"
occurs
more than once in the line, your program will replace only the first occurrence
of "hate". Since we will not discuss input until Chapter 2, use a defined
constant for the string to be changed. To make your program work for another
string, you should only need to change the definition of this defined constant.

---

# Program Documentation: Word Replacement

## Overview
This program replaces the first occurrence of a specific word
in a given sentence with another word.
The program uses constants for the word to be replaced and the replacement word,
making it easy to modify for different inputs.

## Features
1. Replaces the first occurrence of a target word in a sentence.
2. Outputs the original sentence and the modified sentence.
3. Handles cases where the target word is not found.

## Code Explanation
1. Package Declaration: The program is part of the `Projects_set1.Project_05_Word_replacement` package.
2. Constants:
   - `WORD_TO_BE_REPLACE`: The word to be replaced in the sentence.
   - `REPLACING_WORD`: The word that will replace the target word.
3. Main Method:
   - Trims the input sentence to remove leading and trailing spaces.
   - Finds the first occurrence of the target word.
   - If the word is found, replaces it with the replacement word.
   - Outputs the original and modified sentences.
   - If the word is not found, outputs a message indicating this.

---

## How to Run
1. Compile the program using `javac Word_replacement.java`.
2. Run the program using `java Projects_set1.Project_05_Word_replacement.Word_replacement`.
3. The program will display the original sentence and the modified sentence.

## Assumptions
- The input sentence contains the word to be replaced.
- Only the first occurrence of the target word is replaced.

## Limitations
- The program does not handle user input; the sentence and words are hardcoded.
- Case sensitivity is not addressed (e.g., "Hate" will not match "hate").

## Enhancements
- Allow user input for the sentence and words.
- Add support for case-insensitive word replacement.
- Replace all occurrences of the target word if required.