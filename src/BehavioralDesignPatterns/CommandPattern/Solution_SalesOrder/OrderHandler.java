package BehavioralDesignPatterns.CommandPattern.Solution_SalesOrder;

public class OrderHandler {

  public void invoke(Command command) {
    command.executeCommand();
  }

}
