package baseball;

import baseball.BallController.BallComputerController;
import baseball.BallController.BallController;
import baseball.service.ComputerService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        ComputerService computerService = new ComputerService();
        BallComputerController ballComputerController = new BallComputerController();

        BallController ballController = new BallController(inputView, outputView, computerService, ballComputerController);

        ballController.run();
    }
}
