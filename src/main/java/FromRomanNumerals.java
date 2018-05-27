import javafx.util.Pair;

class FromRomanNumerals {

    int translate(String romanNumeral) {
        validateInput(romanNumeral);

        if (romanNumeral.contains("X") && romanNumeral.contains("V")) {
            return translateFourteenToEighteen(romanNumeral);
        }
        if (romanNumeral.contains("X")) {
            return translateNineToThirteen(romanNumeral);
        }
        if (romanNumeral.contains("V")) {
            return translateFourToEight(romanNumeral);
        }
        return translateOneToThree(romanNumeral);
    }

    private void validateInput(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input must not be empty");
        }
        if (!input.matches("[IVXLCDM]*")) {
            throw new IllegalArgumentException("Input must be a roman numeral");
        }
    }

    private int translateOneToThree(String numeral) {
        if (numeral.equals("I")) {
            return 1;
        }
        if (numeral.equals("II")) {
            return 2;
        }
        if (numeral.equals("III")) {
            return 3;
        }
        return 0;
    }

    private int translateFourToEight(String numeral) {
        return translateTwo(numeral, new Pair<>("V", 5));
    }

    private int translateNineToThirteen(String numeral) {
        return translateTwo(numeral, new Pair<>("X", 10));
    }

    private int translateTwo(String numeral, Pair<String, Integer> a) {
        if (numeral.equals(a.getKey())) {
            return a.getValue();
        }

        int indexI = numeral.indexOf("I");
        int indexX = numeral.indexOf(a.getKey());

        if (indexI < indexX) {
            int valueI = translateOneToThree(numeral.substring(indexI, indexX));
            return a.getValue() - valueI;
        } else {
            int valueI = translateOneToThree(numeral.substring(indexI, numeral.length()));
            return a.getValue() + valueI;
        }
    }

    private int translateFourteenToEighteen(String numeral) {
        int value = translateFourToEight(numeral.substring(1, numeral.length()));
        return value + 10;
    }
}
