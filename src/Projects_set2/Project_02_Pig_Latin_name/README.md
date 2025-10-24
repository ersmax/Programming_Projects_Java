# PigLatinName

(This is a version with input of an exercise from Set 1.) Write a program that
inputs two string variables, first and last, which the user should enter with his or
her name. First, convert both strings to all lowercase. Your program should then create
a new string that contains the full name in pig latin with the first letter capitalized
for the first and last name. Use only the pig latin rule of moving the first letter to the
end of the word and adding “ay.” Output the pig latin name to the screen. Use the
substring and toUpperCase methods to construct the new name.
For example, if the user inputs “Walt” for the first name and “Savitch” for the
last name, then the program should create a new string with the text “Altway
Avitchsay” and print it.

---

## Overview
Simple CLI program that reads full names from standard input 
and converts each name token (first, any middle names, last) to Pig Latin. 
Pig Latin rule used: move the first letter to the end of the word and append `ay`. 
Each resulting token is capitalized (first letter uppercase, rest lowercase).

## Files
- `src/Projects_set2/Project_02_Pig_Latin_name/PigLatinName.java` — main program.

## Behavior
- Prompts: `New name? (enter to exit)`.
- Reads one input line per prompt.
- An empty line (or a line with only whitespace) exits the program.
- Input is trimmed and split on one-or-more whitespace (`\\s+`) into tokens.
- Each token is converted to Pig Latin and printed joined by single spaces.

## Implementation details
- Constant: `PREFIX = "ay"`.
- Token processing:
  - Ignore `null` or empty tokens.
  - Single-character token: uppercase the letter and append `PREFIX` (e.g. `A` -> `Aay`).
  - Multi-character token: lowercase, move first character to the end, append `PREFIX`, then capitalize the first character of the result.
- Splitting uses `dummy.trim().split("\\s+")` so multiple spaces/tabs/newlines collapse to a single delimiter and no empty tokens are produced for leading/trailing whitespace.

## Examples
Input:
```
Walt Savitch
```
Output:
```
Altway Avitchsay
```

Input:
```
Mary   Ann  Smith
```
Output:
```
Arymway Nnayay Ithsmsay
```

## Compile and run
From project root:

Compile:
```
javac -d out src/Projects_set2/Project_02_Pig_Latin_name/PigLatinName.java
```

Run:
```
java -cp out Projects_set2.Project_02_Pig_Latin_name.PigLatinName
```

## Notes and potential improvements
- Current implementation normalizes casing (lowercase before transform) 
  which discards original capitalization. If preserving original capitalization 
  or punctuation is desired, update `toPigLatin` to detect and preserve those properties.
- The program trims punctuation attached to words (e.g., `Smith,`) as part of the token. 
  Consider handling punctuation separately if needed.
- Unit tests can be added for `toPigLatin` to validate edge cases 
  (null, empty, single-letter, punctuation).
