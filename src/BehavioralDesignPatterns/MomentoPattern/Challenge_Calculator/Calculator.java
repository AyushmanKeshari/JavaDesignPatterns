package BehavioralDesignPatterns.MomentoPattern.Challenge_Calculator;

public class Calculator {

  public static void main(String[] args) {
    Adder adder = new Adder();
    adder.add(10);
    System.out.println(adder.getResult());
  }

}
