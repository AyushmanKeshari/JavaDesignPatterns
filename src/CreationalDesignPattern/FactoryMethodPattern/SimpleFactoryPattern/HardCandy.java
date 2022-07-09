package CreationalDesignPattern.FactoryMethodPattern.SimpleFactoryPattern;

import java.util.ArrayList;

public class HardCandy extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> chocolatePackage = new ArrayList<>();

        for(int i=1; i<=quantity; i++) {
            Chocolate chocolate = new Chocolate();
            chocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " hard candy made");
        return chocolatePackage;
    }
}
