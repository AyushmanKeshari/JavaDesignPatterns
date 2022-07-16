package BehavioralDesignPatterns.Part1.MomentoPattern.Challenge_Calculator;

public class Adder {

  private int result;

  public void add(int newNumber) {
    result += newNumber;
  }

  public int getResult() {
    return result;
  }

}
