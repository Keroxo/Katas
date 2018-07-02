package classes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Hangman {

    private static final char CHARACTER_PLACEHOLDER = '-';

    private char[] searchedWord;
    private boolean[] guessMask;

    public Hangman(String searchedWord) {
        validateWord(searchedWord);
        this.guessMask = new boolean[searchedWord.length()];
        Arrays.fill(guessMask, false);
        this.searchedWord = searchedWord.toCharArray();
    }

    private void validateWord(String word) {
        if (word.isEmpty()) throw new IllegalArgumentException("Word must not be empty");
        if (!word.matches("([a-z]|[A-Z])*")) throw new IllegalArgumentException("Use only letters");
    }


    String guess(char letter) {
        findOccurrences(letter);
        return getGuessedWord();
    }

    private void findOccurrences(char letter) {
        IntStream.range(0, searchedWord.length)
                .forEach(i -> {
                    if (searchedWord[i] == letter) guessMask[i] = true;
                });
    }


    private String getGuessedWord() {
        char[] result = new char[searchedWord.length];
        IntStream.range(0, searchedWord.length)
                .forEach(i -> {
                    if (guessMask[i]) result[i] = searchedWord[i];
                    else result[i] = CHARACTER_PLACEHOLDER;
                });
        return String.valueOf(result);
    }
}
