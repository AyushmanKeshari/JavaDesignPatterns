package BehavioralDesignPatterns.Part2.VisitorPattern.GroceryWithVisitor;

public interface Groceries {

  double getPrice();

  void accept(Visitor visitor);

}
