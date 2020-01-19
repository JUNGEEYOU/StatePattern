package statewithwinner;

import java.util.Random;

// HasQuarterState: 동전 있는 상태
public class HasQuarterState implements State {
    // 난수 발생기 추가
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);   // 10분의 1로 당첨 기능 넣기
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {   // 당첨 상태
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {   // 기본 판매 상태
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

}