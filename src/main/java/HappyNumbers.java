import java.util.Arrays;

class HappyNumbers {

    private static final int SUM_HAPPY_CASE = 1;
    private static final int SUM_BAD_CASE_1 = 0;
    private static final int SUM_BAD_CASE_2 = 4;

    boolean isHappy(int number) {
        validateInput(number);
        int[] digits = convertNumberToDigits(number);
        return check(digits);
    }

    private void validateInput(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
    }

    private int[] convertNumberToDigits(int number) {
        String numberAsString = String.valueOf(number);
        String[] digitsAsString = numberAsString.split("");
        return Arrays.stream(digitsAsString)
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    private boolean check(int[] digits) {
        int sum = sumSquares(digits);
        if (sum == SUM_HAPPY_CASE)
            return true;
        else if (sum == SUM_BAD_CASE_1 || sum == SUM_BAD_CASE_2)
            return false;
        else
            return check(convertNumberToDigits(sum));
    }

    private int sumSquares(int[] digits) {
        return Arrays.stream(digits)
                .map(this::square)
                .sum();
    }

    private int square(int digit) {
        return digit * digit;
    }
}
