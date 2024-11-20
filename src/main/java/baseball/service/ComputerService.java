package baseball.service;

import baseball.domain.Computer;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class ComputerService {
    public List<Computer> getComputerNumber(List<Integer> computer) {
        List<Computer> computers = new ArrayList<>();
        for (Integer com: computer) {
            computers.add(new Computer(com));
        }
        return computers;
    }

    public List<Integer> getRandomNumber() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
