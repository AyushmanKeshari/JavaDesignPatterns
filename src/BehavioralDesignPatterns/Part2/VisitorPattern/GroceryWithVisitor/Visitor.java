package BehavioralDesignPatterns.Part2.VisitorPattern.GroceryWithVisitor;

public interface Visitor {

    void visit(Bread bread);
    void visit(Milk milk);
    void visit(GroceryList groceryList);

}
