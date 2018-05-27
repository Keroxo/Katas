import java.util.Map;
import java.util.stream.IntStream;

import static java.util.Map.entry;

class FromRomanNumerals {

    private static final Map<Character, Integer> ROMAN_NUMERALS = Map.ofEntries(
            entry('I', 1),
            entry('V', 5),
            entry('X', 10),
            entry('L', 50),
            entry('C', 100),
            entry('D', 500),
            entry('M', 1000)
    );

    int translate(String romanNumeral) {
        validateInput(romanNumeral);
        int[] valuesForChars = translateCharsInValues(romanNumeral);
        valuesForChars = calculateNegativeValues(valuesForChars);
        return IntStream.of(valuesForChars).sum();
    }

    private void validateInput(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input must not be empty");
        }
        if (!input.matches("[IVXLCDM]*")) {
            throw new IllegalArgumentException("Input must be a roman numeral");
        }
    }

    private int[] translateCharsInValues(String numeral) {
        return numeral.codePoints()
                .map(i -> ROMAN_NUMERALS.get((char)i))
                .toArray();
    }

    private int[] calculateNegativeValues(int[] values) {

        int equalsStreak = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] < values[i+1]) {
               values = setNegative(values, i-equalsStreak, i);
            }
            if (values[i] == values[i+1]) {
                equalsStreak++;
            } else {
                equalsStreak = 0;
            }
        }
        return values;
    }

    private int[] setNegative(int[] values, int start, int end) {
        for(int i = start; i <= end; i++) {
            values[i] *= -1;
        }
        return values;
    }
}
