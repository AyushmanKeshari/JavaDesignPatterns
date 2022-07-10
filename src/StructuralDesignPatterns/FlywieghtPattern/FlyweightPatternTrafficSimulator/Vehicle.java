package StructuralDesignPatterns.FlywieghtPattern.FlyweightPatternTrafficSimulator;

public interface Vehicle {

  String getType();
  int[] getLocation();
  void setLocation(int latitude, int longitude);
}
