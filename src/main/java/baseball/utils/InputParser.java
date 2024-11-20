package baseball.utils;


import baseball.domain.Ball;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputParser {
    public int[] parseInt(String input) {
        String[] inputs = input.split("");
        int[] inputNumbers = new int[inputs.length];
        if (InputValidator.isAllNumber(input) && InputValidator.isThreeNumber(input)) {
            inputNumbers = Arrays.stream(inputs).mapToInt(Integer::parseInt).toArray();
        }
        return inputNumbers;
    }

    public static List<Ball> parseBallInt(int[] inputNumbers) {
        List<Ball> balls = new ArrayList<>();
        for (int i: inputNumbers) {
            balls.add(new Ball(i));
        }
        return balls;
    }

}
