package classes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Hangman {

    private static final char CHARACTER_PLACEHOLDER = '-';
    private static final String REGEX_LETTER = "([a-z]|[A-Z])*";

    private char[] searchedWord;
    private boolean[] guessMask;

    public Hangman(String searchedWord) {
        validateWord(searchedWord);
        initGuessMask(searchedWord);
        this.searchedWord = searchedWord.toCharArray();
    }

    private void validateWord(String word) {
        if (word.isEmpty()) throw new IllegalArgumentException("Word must not be empty");
        if (!word.matches(REGEX_LETTER)) throw new IllegalArgumentException("Use only letters");
    }

    private void initGuessMask(String searchedWord) {
        this.guessMask = new boolean[searchedWord.length()];
        Arrays.fill(guessMask, false);
    }

    String guess(char letter) {
        findOccurrences(letter);
        return calculateGuessedWord();
    }

    private void findOccurrences(char letter) {
        IntStream.range(0, searchedWord.length)
                .forEach(i -> {
                    if (searchedWord[i] == letter) guessMask[i] = true;
                });
    }

    private String calculateGuessedWord() {
        char[] result = new char[searchedWord.length];

        IntStream.range(0, searchedWord.length)
                .forEach(i -> result[i] = guessMask[i] ? searchedWord[i] : CHARACTER_PLACEHOLDER);
        return String.valueOf(result);
    }
}
