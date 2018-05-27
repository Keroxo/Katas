import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class FromRomanNumeralsTest {

    private FromRomanNumerals fromRomanNumerals;

    @BeforeEach
    void init() {
        fromRomanNumerals = new FromRomanNumerals();
    }

    @Test
    void testExceptionForEmptyString() {
        Executable executable = () -> fromRomanNumerals.translate("");
        Assertions.assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testExceptionForNumber() {
        Executable executable = () -> fromRomanNumerals.translate("1");
        Assertions.assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testExceptionForLetter() {
        Executable executable = () -> fromRomanNumerals.translate("c");
        Assertions.assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testNumeral1() {
        int actual = fromRomanNumerals.translate("I");
        Assertions.assertEquals(1, actual);
    }

    @Test
    void testNumeral2() {
        int actual = fromRomanNumerals.translate("II");
        Assertions.assertEquals(2, actual);
    }

    @Test
    void testNumeral3() {
        int actual = fromRomanNumerals.translate("III");
        Assertions.assertEquals(3, actual);
    }

    @Test
    void testNumeral4() {
        int actual = fromRomanNumerals.translate("IV");
        Assertions.assertEquals(4, actual);
    }

    @Test
    void testNumeral5() {
        int actual = fromRomanNumerals.translate("V");
        Assertions.assertEquals(5, actual);
    }

    @Test
    void testNumeral6() {
        int actual = fromRomanNumerals.translate("VI");
        Assertions.assertEquals(6, actual);
    }

    @Test
    void testNumeral7() {
        int actual = fromRomanNumerals.translate("VII");
        Assertions.assertEquals(7, actual);
    }

    @Test
    void testNumeral8() {
        int actual = fromRomanNumerals.translate("VIII");
        Assertions.assertEquals(8, actual);
    }

    @Test
    void testNumeral9() {
        int actual = fromRomanNumerals.translate("IX");
        Assertions.assertEquals(9, actual);
    }

    @Test
    void testNumeral10() {
        int actual = fromRomanNumerals.translate("X");
        Assertions.assertEquals(10, actual);
    }

    @Test
    void testNumeral11() {
        int actual = fromRomanNumerals.translate("XI");
        Assertions.assertEquals(11, actual);
    }

    @Test
    void testNumeral12() {
        int actual = fromRomanNumerals.translate("XII");
        Assertions.assertEquals(12, actual);
    }

    @Test
    void testNumeral13() {
        int actual = fromRomanNumerals.translate("XIII");
        Assertions.assertEquals(13, actual);
    }

    @Test
    void testNumeral14() {
        int actual = fromRomanNumerals.translate("XIV");
        Assertions.assertEquals(14, actual);
    }

    @Test
    void testNumeral15() {
        int actual = fromRomanNumerals.translate("XV");
        Assertions.assertEquals(15, actual);
    }

    @Test
    void testNumeral16() {
        int actual = fromRomanNumerals.translate("XVI");
        Assertions.assertEquals(16, actual);
    }

    @Test
    void testNumeral17() {
        int actual = fromRomanNumerals.translate("XVII");
        Assertions.assertEquals(17, actual);
    }

    @Test
    void testNumeral18() {
        int actual = fromRomanNumerals.translate("XVIII");
        Assertions.assertEquals(18, actual);
    }
}
