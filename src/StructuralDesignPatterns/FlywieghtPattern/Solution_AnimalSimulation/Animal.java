package StructuralDesignPatterns.FlywieghtPattern.Solution_AnimalSimulation;

public interface Animal {

  String getAnimalType();
  int[] getLocation();
  void setLocation(int latitude, int longitude);

}
