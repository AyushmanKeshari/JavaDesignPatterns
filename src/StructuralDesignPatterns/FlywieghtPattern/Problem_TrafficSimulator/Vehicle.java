package StructuralDesignPatterns.FlywieghtPattern.Problem_TrafficSimulator;

public interface Vehicle {

  String getType();
  int[] getLocation();
  void setLocation(int latitude, int longitude);
}
