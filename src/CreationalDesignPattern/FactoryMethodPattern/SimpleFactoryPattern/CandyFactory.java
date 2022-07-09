package CreationalDesignPattern.FactoryMethodPattern.SimpleFactoryPattern;

import java.util.ArrayList;

public class CandyFactory {

    public ArrayList<Candy> getCandyPackage (int quantity, String type) {
        Candy candy = getCandy(type);
        ArrayList<Candy> candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

    public Candy getCandy(String type) {
        switch (type) {
            case "hard candy":
                return new HardCandy();
            case "chocolate":
                return new Chocolate();
            default:
                return null;
        }
    }
}
