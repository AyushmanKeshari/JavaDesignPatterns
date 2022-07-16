package BehavioralDesignPatterns.Part1.CommandPattern.Solution_SalesOrder;

public class PlaceOrderCommand implements Command {

    private Jacket jacket;

    public PlaceOrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void executeCommand() {
        jacket.placeOrder();
    }
}
