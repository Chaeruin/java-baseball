package baseball.BallController;

import baseball.domain.Ball;
import baseball.domain.Computer;
import baseball.enums.ResultBall;
import baseball.service.ComputerService;
import baseball.utils.InputParser;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BallController {
    final InputView inputView;
    final OutputView outputView;
    final ComputerService computerService;
    final BallComputerController ballComputerController;

    public BallController(InputView inputView, OutputView outputView, ComputerService computerService, BallComputerController ballComputerController) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.computerService = computerService;
        this.ballComputerController = ballComputerController;
    }

    public void run() {
        String inputRepeat = "1";
        while (inputRepeat.equals("1")) {
            setResultBallEnums();
            List<Computer> computerNumbers = computerService.getComputerNumber(computerService.getRandomNumber());
            while(ResultBall.STRIKE.getResultNumber() != 3) {
                setResultBallEnums();
                List<Ball> ballNumbers = InputParser.parseBallInt(InputParser.parseInt(inputView.getNumber()));
                ballComputerController.ballGame(ballNumbers, computerNumbers);
                outputView.printResult();
            }

            inputRepeat = inputView.getReGame();
            if (inputRepeat.equals("2")) {
                System.out.println("게임 종료");
            }
        }

    }

    void setResultBallEnums() {
        ResultBall.BALL.setResultNumber(0);
        ResultBall.STRIKE.setResultNumber(0);
        ResultBall.NOTHING.setResultNumber(0);
    }

}
