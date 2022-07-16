package BehavioralDesignPatterns.Part2.StatePattern.Challenge_ControlTemp;

public class Main {

  public static void main(String[] args) {
    Fan fan = new Fan();
    fan.turnUp();
    fan.turnUp();
    fan.turnDown();
    fan.turnDown();
    fan.turnUp();
  }

}
