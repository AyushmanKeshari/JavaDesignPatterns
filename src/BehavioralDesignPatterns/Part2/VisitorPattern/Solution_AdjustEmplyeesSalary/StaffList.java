package BehavioralDesignPatterns.Part2.VisitorPattern.Solution_AdjustEmplyeesSalary;

import java.util.ArrayList;

public class StaffList implements Employee {

  ArrayList<Employee> salaries = new ArrayList<Employee>();

  public StaffList() {
    Manager manager = new Manager();
    SalesPerson salesPerson1 = new SalesPerson();
    SalesPerson salesPerson2 = new SalesPerson();
    salaries.add(manager);
    salaries.add(salesPerson1);
    salaries.add(salesPerson2);
  }

  public int getSalary() {
    return salaries.stream().mapToInt(Employee::getSalary).sum();
  }

  @Override
  public void accept(Visitor visitor) {
    for (Employee salary : salaries) {
      salary.accept(visitor);
    }
//    salaries.forEach(g -> g.accept(visitor));
    visitor.visit(this);
  }

}
