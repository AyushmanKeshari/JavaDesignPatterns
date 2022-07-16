package BehavioralDesignPatterns.Part2.StatePattern.Solution_ControlTemp;

public class LowState implements State {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is on Medium");
    }

    @Override
    public void turnDown(Fan fan) {

    }
}
