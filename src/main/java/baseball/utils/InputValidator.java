package baseball.utils;

import baseball.enums.ErrorMessage;
import java.util.Arrays;

public class InputValidator {

    public static boolean isAllNumber(String input) {
        String[] inputs = input.split("");
        try {
            int[] inputNumbers = Arrays.stream(inputs).mapToInt(Integer::parseInt).toArray();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_NOT_NUMBER.getErrorMessage());
        }
        return true;
    }

    public static boolean isThreeNumber(String input) {
        String[] inputs = input.split("");
        if (inputs.length != 3) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NOT_THREE_NUMBER.getErrorMessage());
        }
        return true;
    }
}
