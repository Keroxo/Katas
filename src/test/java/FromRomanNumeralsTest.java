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

    @Test
    void testNumeral19() {
        int actual = fromRomanNumerals.translate("XIX");
        Assertions.assertEquals(19, actual);
    }

    @Test
    void testNumeral20() {
        int actual = fromRomanNumerals.translate("XX");
        Assertions.assertEquals(20, actual);
    }

    @Test
    void testNumeral22() {
        int actual = fromRomanNumerals.translate("XXII");
        Assertions.assertEquals(22, actual);
    }

    @Test
    void testNumeral30() {
        int actual = fromRomanNumerals.translate("XXX");
        Assertions.assertEquals(30, actual);
    }

    @Test
    void testNumeral33() {
        int actual = fromRomanNumerals.translate("XXXIII");
        Assertions.assertEquals(33, actual);
    }

    @Test
    void testNumeral40() {
        int actual = fromRomanNumerals.translate("XL");
        Assertions.assertEquals(40, actual);
    }

    @Test
    void testNumeral44() {
        int actual = fromRomanNumerals.translate("XLIV");
        Assertions.assertEquals(44, actual);
    }

    @Test
    void testNumeral50() {
        int actual = fromRomanNumerals.translate("L");
        Assertions.assertEquals(50, actual);
    }

    @Test
    void testNumeral55() {
        int actual = fromRomanNumerals.translate("LV");
        Assertions.assertEquals(55, actual);
    }

    @Test
    void testNumeral60() {
        int actual = fromRomanNumerals.translate("LX");
        Assertions.assertEquals(60, actual);
    }

    @Test
    void testNumeral66() {
        int actual = fromRomanNumerals.translate("LXVI");
        Assertions.assertEquals(66, actual);
    }

    @Test
    void testNumeral70() {
        int actual = fromRomanNumerals.translate("LXX");
        Assertions.assertEquals(70, actual);
    }

    @Test
    void testNumeral77() {
        int actual = fromRomanNumerals.translate("LXXVII");
        Assertions.assertEquals(77, actual);
    }

    @Test
    void testNumeral80() {
        int actual = fromRomanNumerals.translate("LXXX");
        Assertions.assertEquals(80, actual);
    }

    @Test
    void testNumeral88() {
        int actual = fromRomanNumerals.translate("LXXXVIII");
        Assertions.assertEquals(88, actual);
    }

    @Test
    void testNumeral90() {
        int actual = fromRomanNumerals.translate("XC");
        Assertions.assertEquals(90, actual);
    }

    @Test
    void testNumeral99() {
        int actual = fromRomanNumerals.translate("XCIX");
        Assertions.assertEquals(99, actual);
    }

    @Test
    void testNumeral100() {
        int actual = fromRomanNumerals.translate("C");
        Assertions.assertEquals(100, actual);
    }

    @Test
    void testNumeral119() {
        int actual = fromRomanNumerals.translate("CXIX");
        Assertions.assertEquals(119, actual);
    }

    @Test
    void testNumeral200() {
        int actual = fromRomanNumerals.translate("CC");
        Assertions.assertEquals(200, actual);
    }

    @Test
    void testNumeral214() {
        int actual = fromRomanNumerals.translate("CCXIV");
        Assertions.assertEquals(214, actual);
    }

    @Test
    void testNumeral304() {
        int actual = fromRomanNumerals.translate("CCCIV");
        Assertions.assertEquals(304, actual);
    }

    @Test
    void testNumeral468() {
        int actual = fromRomanNumerals.translate("CDLXVIII");
        Assertions.assertEquals(468, actual);
    }

    @Test
    void testNumeral545() {
        int actual = fromRomanNumerals.translate("DXLV");
        Assertions.assertEquals(545, actual);
    }

    @Test
    void testNumeral633() {
        int actual = fromRomanNumerals.translate("DCXXXIII");
        Assertions.assertEquals(633, actual);
    }

    @Test
    void testNumeral774() {
        int actual = fromRomanNumerals.translate("DCCLXXIV");
        Assertions.assertEquals(774, actual);
    }

    @Test
    void testNumeral895() {
        int actual = fromRomanNumerals.translate("DCCCXCV");
        Assertions.assertEquals(895, actual);
    }

    @Test
    void testNumeral921() {
        int actual = fromRomanNumerals.translate("CMXXI");
        Assertions.assertEquals(921, actual);
    }

    @Test
    void testNumeral1000() {
        int actual = fromRomanNumerals.translate("M");
        Assertions.assertEquals(1000, actual);
    }
}
