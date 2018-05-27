import java.util.Arrays;
import java.util.stream.IntStream;

public class FizzBuzz {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FizzBuzz().generate()));
    }

    String[] generate() {
        return IntStream.rangeClosed(MIN_VALUE, MAX_VALUE)
                .mapToObj(this::replaceNumberWithFizzAndBuzz)
                .toArray(String[]::new);
    }

    private String replaceNumberWithFizzAndBuzz(int value) {

        if (isMultipleOfThree(value) && isMultipleOfFive(value)) {
            return "FizzBuzz";
        }
        if (isMultipleOfThree(value)) {
            return "Fizz";
        }
        if (isMultipleOfFive(value)) {
            return "Buzz";
        }
        return String.valueOf(value);
    }

    private boolean isMultipleOfThree(int value) {
        return value % 3 == 0;
    }

    private boolean isMultipleOfFive(int value) {
        return value % 5 == 0;
    }
}
