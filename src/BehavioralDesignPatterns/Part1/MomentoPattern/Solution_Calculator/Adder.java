package BehavioralDesignPatterns.Part1.MomentoPattern.Solution_Calculator;

public class Adder {

    private int result;
    private Momento momento = new Momento(result);

    public void add(int newNumber) {
        result += newNumber;
    }

    public int getResult() {
        return result;
    }

    public void save() {
        momento.setState(result);
    }

    public void undo() {
        result = momento.getState();
    }

}
