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

    public static boolean isNotDuplicate(String input) {
        String[] inputs = input.split("");
        if (inputs[0].equals(inputs[1]) || inputs[0].equals(inputs[2]) || inputs[1].equals(inputs[2])) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_DUPLICATE_NUMBER.getErrorMessage());
        }
        return true;
    }

    public static boolean isNumberZero(String input) {
        String[] inputs = input.split("");
        if (inputs[0].equals("0") || inputs[1].equals("0") || inputs[2].equals("0")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER_ZERO.getErrorMessage());
        }
        return true;
    }
}
