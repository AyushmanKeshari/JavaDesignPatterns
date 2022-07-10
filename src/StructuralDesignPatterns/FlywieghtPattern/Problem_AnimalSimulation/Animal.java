package StructuralDesignPatterns.FlywieghtPattern.Problem_AnimalSimulation;

public interface Animal {

  String getAnimalType();
  int[] getLocation();
  void setLocation(int latitude, int longitude);

}
