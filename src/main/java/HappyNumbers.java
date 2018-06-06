class HappyNumbers {

    boolean isHappy(int number) {
        validateInput(number);
        return false;
    }

    private void validateInput(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
    }
}
