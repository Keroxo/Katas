import java.util.Arrays;

class HappyNumbers {

    boolean isHappy(int number) {
        validateInput(number);
        int[] digits = transformNumberIntoDigits(number);
        return calculate(digits);
    }

    private void validateInput(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
    }

    private int[] transformNumberIntoDigits(int number) {
        String numberAsString = String.valueOf(number);
        String[] digitsAsString = numberAsString.split("");
        return Arrays.stream(digitsAsString).mapToInt(Integer::valueOf).toArray();
    }

    private boolean calculate(int[] digits) {
        int sum = 0;
        for (int i : digits) {
            sum += square(i);
        }
        if(sum == 1) {return true;}
        else if (sum == 0 || sum == 4) {return false;}
        else {
            return calculate(transformNumberIntoDigits(sum));
        }
    }
    private int square(int digit) {
        return digit * digit;
    }
}
