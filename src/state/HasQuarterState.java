package state;

// HasQuarterState: 동전 있는 상태
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());  // 동전을 돌려주고 동전상태를 변경
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());  // 손잡이 돌리고, 판매 상태로 변경
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}