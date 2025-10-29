# Grades and Text Replacement

(This is a variant of an exercise from set 1.) Create a text file that contains the
text "I hate programming!" Write a program that reads in this line of text from
the file and then the text with the first occurrence of "hate" changed to "love". In
this case, the program would output "I love programming!" Your program should
work with any line of text that contains the word "hate", not just the example given
in this problem. If the word "hate" occurs more than once in the line, your program
should replace only the first occurrence of "hate".

---

## Purpose
- Read each line from `src/Projects_set2/Project_12_Text_Replacement_File/Example.txt` and print the same line with only the first whole\-word, case\-insensitive occurrence of `hate` replaced by `love`.
- Preserve original spacing, punctuation and casing of the rest of the line.

High-level algorithm (step\-by\-step)
1. Open the file with a `Scanner` and iterate line by line.
2. Convert the current line to lower case to perform a case\-insensitive search for the target word (`REPLACED`).
3. Use `String.indexOf(...)` to locate the first occurrence of the target substring.
4. For each match candidate, perform boundary checks:
    - Check the character immediately before the match (if any). It must not be a word character (letters, digits, underscore).
    - Check the character immediately after the match (if any). It must not be a word character.
    - If both checks pass, the candidate is a whole\-word match; stop searching.
    - Otherwise, continue searching from the next position.
5. If a valid position is found, build the modified line by concatenating:
    - substring before the match + `REPLACING` + substring after the match.
    - Print the modified line.
6. If no valid whole\-word match is found, print the original line.
7. Close the `Scanner`.

## Key constants and helper
- `REPLACED` — the target word to find (`"hate"`).
- `REPLACING` — the replacement word (`"love"`).
- `PATH` — path to the input file.
- `isSpace(char)` (helper) — returns true when a character is not a letter, digit, or underscore; used to detect word boundaries.

## Behavior notes
- Case\-insensitive: the search treats `Hate`, `HATE`, `hate` the same for matching, but replacement uses the exact content of `REPLACING` (`"love"`), so original capitalization of the replaced word is not preserved.
- Whole\-word only: strings like `unhateful` or `whateverhate` are not considered matches because adjacent characters are letters/digits/underscore.
- Replaces only the first valid whole\-word occurrence per line; subsequent occurrences are left unchanged.
- Lines with the target at the very start or end are handled correctly by boundary checks.

## Complexity
- Each line is scanned left to right; in worst case the algorithm can examine each candidate occurrence once. Time per line is O(n) where n is line length (with constant factor for boundary checks).
- Memory usage is O(n) per line (due to building the modified string).

## Edge cases & limitations
- Replacement does not preserve the original word's capitalization (e.g., `Hate` → `love`).
- Non\-word separators considered: any character not a letter, digit, or underscore; this treats hyphens, punctuation and spaces as boundaries.
- If the input file is large, the program prints lines as it processes them (streaming); it does not load entire file into memory.
- `Scanner` created from a file is closed at the end; avoid closing `System.in` scanners in similar code.

## Alternatives & improvements
- Use regex with word boundaries and case\-insensitive flag: `line.replaceFirst("(?i)\\bhate\\b", "love")` — shorter but requires care with regex escaping and performance for many lines.
- Preserve capitalization of the replaced word (e.g., `Hate` → `Love`) by detecting the original word case and adjusting `REPLACING`.
- Expose input path and target/replacement as command\-line arguments or configuration.
- Add unit tests for the helper logic (start/end of line, punctuation, multiple occurrences, mixed casing).

## Testing suggestions
- Lines to test: `"I hate programming!"`, `"Hate it or love it."`, `"unhateful hate"`, `"hate-hate"`, `"thisisahate"`, `""` (empty), `"HATE!"`.
- Verify only the first valid whole\-word occurrence is replaced and that non\-word matches are ignored.