package StructuralDesignPatterns.FacadePattern.Solution_DrivingCar;

public class Car {

  public static void main(String[] args) {
    CarFacade carFacade = new CarFacade();
    carFacade.drive();
  }

}
