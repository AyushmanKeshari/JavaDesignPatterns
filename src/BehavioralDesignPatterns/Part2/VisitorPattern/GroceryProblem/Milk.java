package BehavioralDesignPatterns.Part2.VisitorPattern.GroceryProblem;

public class Milk implements Groceries {

  private double price = 2;

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }


}
