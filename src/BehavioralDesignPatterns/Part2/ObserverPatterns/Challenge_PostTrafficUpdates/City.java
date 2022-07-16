package BehavioralDesignPatterns.Part2.ObserverPatterns.Challenge_PostTrafficUpdates;

public class City {

  private String trafficUpdate = "";

  public void updateTraffic(String trafficUpdate) {
    this.trafficUpdate = trafficUpdate;
  }

}
