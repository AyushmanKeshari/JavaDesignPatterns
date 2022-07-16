package BehavioralDesignPatterns.Part1.CommandPattern.Solution_SalesOrder;

public class OrderHandler {

  public void invoke(Command command) {
    command.executeCommand();
  }

}
