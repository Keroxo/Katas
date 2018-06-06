import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class HappyNumbersTest {

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
}
