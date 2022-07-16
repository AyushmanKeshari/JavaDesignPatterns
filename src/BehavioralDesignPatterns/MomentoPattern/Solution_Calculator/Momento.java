package BehavioralDesignPatterns.MomentoPattern.Solution_Calculator;

public class Momento {

    private int state;

    public Momento(int state) {
        this.state = state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
