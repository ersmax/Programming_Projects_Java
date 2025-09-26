package Projects_set1.Project_05_Word_replacement;

/**
 * This class replaces the first occurrence of a word in a sentence with another word
 */
public class Word_replacement {

    public static final String WORD_TO_BE_REPLACE = "hatee";
    public static final String REPLACING_WORD = "love";

    /**
     * Main method
     * Precondition: none
     * Postcondition: prints the modified sentence
     * @param args
     */

    public static void main(String[] args) {
        String sentence = " I hate you, but I hate you, and I hate you  ";
        String newSentence;
        int startingPosition;
        String afterWord;

        newSentence = sentence.trim();
        startingPosition = newSentence.indexOf(WORD_TO_BE_REPLACE);

        if (startingPosition != -1) {
            afterWord = newSentence.substring(startingPosition
                    + WORD_TO_BE_REPLACE.length());

            newSentence = newSentence.substring(0, startingPosition)
                    + REPLACING_WORD
                    + afterWord;
            System.out.println(sentence + "\nbecomes:\n" + newSentence);
        } else {
            System.out.println("The word to be replaced was not found.");
        }

    }
}
