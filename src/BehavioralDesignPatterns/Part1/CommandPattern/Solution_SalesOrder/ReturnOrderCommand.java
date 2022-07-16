package BehavioralDesignPatterns.Part1.CommandPattern.Solution_SalesOrder;

public class ReturnOrderCommand implements Command {

    private Jacket jacket;

    public ReturnOrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void executeCommand() {
        jacket.returnOrder();
    }
}
