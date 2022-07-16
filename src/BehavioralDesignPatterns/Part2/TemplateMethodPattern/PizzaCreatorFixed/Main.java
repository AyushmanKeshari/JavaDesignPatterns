package BehavioralDesignPatterns.Part2.TemplateMethodPattern.PizzaCreatorFixed;

public class Main {

  public static void main(String[] args) {
    VegetarianPizza vegetarian = new VegetarianPizza();
    vegetarian.printInstructions();

    MeatFeastPizza meatFeast = new MeatFeastPizza();
    meatFeast.printInstructions();
  }

}
