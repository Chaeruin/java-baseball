package baseball.BallController;

import baseball.domain.Ball;
import baseball.domain.Computer;
import baseball.enums.ResultBall;
import java.util.List;

public class BallComputerController {
    // if - 스트라이크 , elseif - 볼 , else - 낫싱(3일때만 유효)
    public void ballGame(List<Ball> ball, List<Computer> computer) {
        for (int i = 0; i < computer.size(); i++) {
            int match = isMatchPlaceNumber(ball, computer.get(i));
            if (i == match) {
                ResultBall.STRIKE.setResultNumber(ResultBall.STRIKE.getResultNumber() + 1);
            }
            else if (match != -1) {
                ResultBall.BALL.setResultNumber(ResultBall.BALL.getResultNumber() + 1);
            }
            else {
                ResultBall.NOTHING.setResultNumber(ResultBall.NOTHING.getResultNumber() + 1);
            }
        }
    }

    //
    public int isMatchPlaceNumber(List<Ball> ball, Computer computer) {
        for (int i = 0; i < ball.size(); i++) {
            if (ball.get(i).getBallInt() == computer.getBallInt()) {
                return i;
            }
        }
        return -1;
    }
}
