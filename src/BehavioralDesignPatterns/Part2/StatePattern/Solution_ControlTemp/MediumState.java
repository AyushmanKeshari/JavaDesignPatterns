package BehavioralDesignPatterns.Part2.StatePattern.Solution_ControlTemp;

public class MediumState implements State {

    @Override
    public void turnUp(Fan fan) {
        fan.setState(new HighState());
        System.out.println("Fan is on High");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new LowState());
        System.out.println("Fan is on Low");
    }
}
