package StructuralDesignPatterns.AdapterPattern.AdapterPatterPriceCalculatorProject;

import org.example.UKCarPriceCalculator;

public class Main {
    public static void main(String[] args) {
        CarPriceCalculator carPriceCalculator = new CarPriceCalculator("Ford", 3);
        printVehiclePrice(carPriceCalculator);

        TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(10,1);
        printVehiclePrice(truckPriceCalculator);

        UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("BMW", 7);
//        printVehiclePrice(ukCarPriceCalculator);  //Not possible to call directly. Use Adapter instead for outside class.
        Adapter adapter = new Adapter(ukCarPriceCalculator);
        printVehiclePrice(adapter);
    }

    public static void printVehiclePrice(PriceCalculator calculator) {
        String price = calculator.calculatePrice();
        System.out.println("The price of vehicle is: " + price);
    }
}
