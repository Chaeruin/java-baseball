package baseball.enums;

public enum ErrorMessage {

    INVALID_INPUT_NOT_NUMBER("[ERROR] 숫자 아님"),
    INVALID_NOT_THREE_NUMBER("[ERROR] 숫자 3개 아님");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}