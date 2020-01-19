package statewithwinner;

// State: 상태 인터페이스
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
