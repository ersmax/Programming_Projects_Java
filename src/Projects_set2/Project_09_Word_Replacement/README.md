# Word replacement

(This is a better version of an exercise from Chapter 1. Project 5). Write a program that
reads in a line of text and then outputs that line of text with the first occurrence of
"hate" changed to "love". For example, a possible sample dialogue might be the
following:
Enter a line of text.
I hate you.
I have rephrased that line to read:
I love you.
You can assume that the word "hate" occurs in the input. If the word "hate"
occurs more than once in the line, your program should replace only the first
occurrence of "hate".

---

## Overview
- Reads one input line from the console and replaces the first whole-word occurrence of `hate` with `love`.
- Matching is case\-insensitive (the code converts the input to lowercase for search) while replacement preserves the original surrounding text.

## Key elements
- `REPLACED_WORD` — `hate` (the word to find).
- `REPLACING_WORD` — `love` (the word to insert).
- `isWordChar(char c)` — helper that returns true for letters, digits, or underscore, used to detect word boundaries.

## Algorithm 
1. Read a full line from `System.in` using `Scanner`.
2. Create a lowercase copy of the input (`lower`) and find the first occurrence index of `REPLACED_WORD` in that lowercase string.
3. Loop while an occurrence is found:
    - Compute `beforeIdx = position - 1` and `afterIdx = position + REPLACED_WORD.length()`.
    - Determine `beforeSpace` as true when `beforeIdx < 0` (start of line) or the char at `beforeIdx` is not a word character.
    - Determine `afterSpace` as true when `afterIdx == lower.length()` (end of line) or the char at `afterIdx` is not a word character.
    - If both `beforeSpace` and `afterSpace` are true, the occurrence is a whole word and the loop breaks with this `position`.
    - Otherwise continue searching from `position + 1`.
4. If no whole\-word occurrence is found, print `Word not found`. Otherwise build the new string by concatenating:
    - substring before `position`,
    - `REPLACING_WORD`,
    - substring after the original word,
      and print the result.
5. Close the `Scanner`.

## Safety and correctness notes
- The code uses `lower.charAt(...)` only when the index is within bounds. The boolean expressions rely on Java’s short\-circuit evaluation (e.g., `afterIdx == lower.length() || !isWordChar(lower.charAt(afterIdx))`) so `charAt` is not evaluated when `afterIdx` equals the string length, avoiding `IndexOutOfBoundsException`.
- Using a lowercase copy (`lower`) makes the search case\-insensitive while preserving original casing for the replacement assembly.
- `isWordChar` treats underscore (`_`) as a word character. That means `hate_` or `_hate` will be considered part of a larger word (not replaced)

Examples
- Input: `I hate you.` → Output: `I love you.`
- Input: `I HATE you.` → Output: `I love you.` (case\-insensitive match)
- Input: `unhateful person hates` → No replacement for the `hate` inside `unhateful`; only a standalone `hate` would be replaced.

Limitations / possible improvements
- Current word boundary test treats underscore as a word character; change `isWordChar` if underscores should be non\-word.
- For more robust boundary handling (Unicode word boundaries, locales, punctuation rules), you may consider using regular expressions with `\b` (word boundaries) or `BreakIterator` for locale\-aware word detection.
- The program only replaces the first whole\-word occurrence. To replace all, iterate and apply replacements accordingly with loops.

## Alternative implementation using regex
An alternative approach could use regular expressions with word boundaries:

```java
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class WordReplacement {
    private static final String REPLACED_WORD = "hate";
    private static final String REPLACING_WORD = "love";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text.");
        String input = scanner.nextLine();

        // Use regex to replace the first whole-word occurrence
        // \b denotes word boundary
        String regex = "\\b" + REPLACED_WORD + "\\b";
        // Compile reusable pattern with case-insensitive flag
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        // Create matcher for searching the input
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String result = matcher.replaceFirst(REPLACING_WORD);
            System.out.println("I have rephrased that line to read:");
            System.out.println(result);
        } else {
            System.out.println("Word not found");
        }

        scanner.close();
    }
}
```