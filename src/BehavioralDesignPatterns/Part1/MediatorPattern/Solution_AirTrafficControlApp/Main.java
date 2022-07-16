package BehavioralDesignPatterns.Part1.MediatorPattern.Solution_AirTrafficControlApp;

public class Main {

  public static void main(String[] args) {
    AirTrafficController_Mediator mediator = new AirTrafficController_Mediator(123);
    mediator.takeOff();
  }

}
