import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class HappyNumbersTest {

    private HappyNumbers happyNumbers;

    @BeforeEach
    void init() {
        happyNumbers = new HappyNumbers();
    }

    @Test
    void testExceptionForNegativeNumber() {
        Executable executable = () -> happyNumbers.isHappy(-1);
        Assertions.assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void testNumber0() {
        boolean isHappy = happyNumbers.isHappy(0);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber1() {
        boolean isHappy = happyNumbers.isHappy(1);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber3() {
        boolean isHappy = happyNumbers.isHappy(3);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber4() {
        boolean isHappy = happyNumbers.isHappy(4);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber5() {
        boolean isHappy = happyNumbers.isHappy(5);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber6() {
        boolean isHappy = happyNumbers.isHappy(6);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber7() {
        boolean isHappy = happyNumbers.isHappy(7);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber8() {
        boolean isHappy = happyNumbers.isHappy(8);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber9() {
        boolean isHappy = happyNumbers.isHappy(9);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber10() {
        boolean isHappy = happyNumbers.isHappy(10);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber11() {
        boolean isHappy = happyNumbers.isHappy(11);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber12() {
        boolean isHappy = happyNumbers.isHappy(12);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber13() {
        boolean isHappy = happyNumbers.isHappy(13);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber14() {
        boolean isHappy = happyNumbers.isHappy(14);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber15() {
        boolean isHappy = happyNumbers.isHappy(15);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber16() {
        boolean isHappy = happyNumbers.isHappy(16);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber17() {
        boolean isHappy = happyNumbers.isHappy(17);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber18() {
        boolean isHappy = happyNumbers.isHappy(18);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber19() {
        boolean isHappy = happyNumbers.isHappy(19);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber20() {
        boolean isHappy = happyNumbers.isHappy(20);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber22() {
        boolean isHappy = happyNumbers.isHappy(22);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber23() {
        boolean isHappy = happyNumbers.isHappy(23);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber25() {
        boolean isHappy = happyNumbers.isHappy(25);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber28() {
        boolean isHappy = happyNumbers.isHappy(28);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber30() {
        boolean isHappy = happyNumbers.isHappy(30);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber31() {
        boolean isHappy = happyNumbers.isHappy(31);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber32() {
        boolean isHappy = happyNumbers.isHappy(32);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber33() {
        boolean isHappy = happyNumbers.isHappy(33);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber42() {
        boolean isHappy = happyNumbers.isHappy(42);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber44() {
        boolean isHappy = happyNumbers.isHappy(44);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber49() {
        boolean isHappy = happyNumbers.isHappy(49);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber68() {
        boolean isHappy = happyNumbers.isHappy(68);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber69() {
        boolean isHappy = happyNumbers.isHappy(69);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber70() {
        boolean isHappy = happyNumbers.isHappy(70);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber79() {
        boolean isHappy = happyNumbers.isHappy(79);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber80() {
        boolean isHappy = happyNumbers.isHappy(80);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber82() {
        boolean isHappy = happyNumbers.isHappy(82);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber86() {
        boolean isHappy = happyNumbers.isHappy(86);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber91() {
        boolean isHappy = happyNumbers.isHappy(91);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber94() {
        boolean isHappy = happyNumbers.isHappy(94);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber97() {
        boolean isHappy = happyNumbers.isHappy(97);
        Assertions.assertTrue(isHappy);
    }

    @Test
    void testNumber99() {
        boolean isHappy = happyNumbers.isHappy(99);
        Assertions.assertFalse(isHappy);
    }

    @Test
    void testNumber100() {
        boolean isHappy = happyNumbers.isHappy(100);
        Assertions.assertTrue(isHappy);
    }
}
