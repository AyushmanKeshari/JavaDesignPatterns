package BehavioralDesignPatterns.Part2.VisitorPattern.Challenge_AdjustEmplyeesSalary;

public class Manager implements Employee {

  private int salary = 60000;

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

}
