package function;

import function.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void init () {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void testLength() {
        String[] actual = fizzBuzz.generate();
        Assertions.assertEquals(100, actual.length);
    }

    @Test
    void testFirstItem() {
        String[] actual = fizzBuzz.generate();
        Assertions.assertEquals("1", actual[0]);
    }

    @Test
    void testFirstFizz() {
        String[] actual = fizzBuzz.generate();
        Assertions.assertEquals("Fizz", actual[2]);
    }

    @Test
    void testFirstBuzz() {
        String[] actual = fizzBuzz.generate();
        Assertions.assertEquals("Buzz", actual[4]);
    }

    @Test
    void testFirstFizzBuzz() {
        String[] actual = fizzBuzz.generate();
        Assertions.assertEquals("function.FizzBuzz", actual[14]);
    }
}
