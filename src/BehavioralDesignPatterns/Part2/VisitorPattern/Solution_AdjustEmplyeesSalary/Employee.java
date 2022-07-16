package BehavioralDesignPatterns.Part2.VisitorPattern.Solution_AdjustEmplyeesSalary;

public interface Employee {

  int getSalary();

  void accept(Visitor visitor);

}
