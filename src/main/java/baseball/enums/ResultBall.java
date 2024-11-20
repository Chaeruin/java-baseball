package baseball.enums;

public enum ResultBall {
    STRIKE(0),
    BALL(0),
    NOTHING(0);

    private int resultNumber;

    ResultBall(int resultNumber) {
        this.resultNumber = resultNumber;
    }

    public int getResultNumber() {
        return this.resultNumber;
    }

    public void setResultNumber(int resultNumber) {
        this.resultNumber = resultNumber;
    }
}
