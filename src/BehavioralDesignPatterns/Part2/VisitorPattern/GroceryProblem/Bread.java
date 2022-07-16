package BehavioralDesignPatterns.Part2.VisitorPattern.GroceryProblem;

public class Bread implements Groceries {

  private double price = 1;

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

}
