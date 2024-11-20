package baseball.view;

import baseball.enums.ResultBall;

public class OutputView {
    public void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printResult() {
        int nothing = ResultBall.NOTHING.getResultNumber();
        if (nothing == 3) {
            System.out.print("낫싱");
        }
        int ball = ResultBall.BALL.getResultNumber();
        if (ball != 0) {
            System.out.print(ball + "볼 ");
        }
        int strike = ResultBall.STRIKE.getResultNumber();
        if (strike != 0 && strike != 3) {
            System.out.print(strike + "스트라이크 ");
        } else if (strike == 3) {
            System.out.println(strike + "스트라이크");
            System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
        System.out.println();
    }
}
