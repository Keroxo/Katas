package classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class HangmanTest {

    @Test
    void testExceptionForEmptyString() {
        Executable executable = () -> new Hangman("");
        Assertions.assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testExceptionForNumbers() {
        Executable executable = () -> new Hangman("1");
        Assertions.assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testExceptionForSpecialCharacters() {
        Executable executable = () -> new Hangman("$");
        Assertions.assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testNoExceptionForLowerCaseLetters() {
        new Hangman("a");
    }

    @Test
    void testNoExceptionForUpperCaseLetters() {
        new Hangman("A");
    }

    @Test
    void testNoExceptionForWord() {
        new Hangman("HelloWorld");
    }

    @Test
    void testOneLetterFail() {
        Hangman hangman = new Hangman("A");
        String actual = hangman.guess('a');
        Assertions.assertEquals("-", actual);
    }

    @Test
    void testOneLetterSuccess() {
        Hangman hangman = new Hangman("A");
        String actual = hangman.guess('A');
        Assertions.assertEquals("A", actual);
    }

    @Test
    void testTwoLetterSuccess() {
        Hangman hangman = new Hangman("is");
        String actual = hangman.guess('i');
        Assertions.assertEquals("i-", actual);
        actual = hangman.guess('s');
        Assertions.assertEquals("is", actual);
    }
}
