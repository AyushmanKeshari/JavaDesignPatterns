package BehavioralDesignPatterns.Part2.VisitorPattern.Solution_AdjustEmplyeesSalary;

public interface Visitor {

    void visit(Manager manager);
    void visit(SalesPerson salesPerson);
    void visit(StaffList staffList);

}
