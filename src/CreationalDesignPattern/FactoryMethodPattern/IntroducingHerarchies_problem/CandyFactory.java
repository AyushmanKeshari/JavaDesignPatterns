package CreationalDesignPattern.FactoryMethodPattern.IntroducingHerarchies_problem;

import java.util.ArrayList;

//Code will become more complex as more types of Candy is added.
public class CandyFactory {

    public ArrayList<Candy> getCandyPackage (int quantity, String type, String section) {
        Candy candy = getCandy(type);

        if(section.equals("hard candy")) {
            if(quantity%10 != 0) {
                System.out.println("Hard candy must be packaged in multiples of 10.");
                return null;
            }
        }

        ArrayList<Candy> candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

    public Candy getCandy(String type) {
        switch (type) {
            case "dark":
                return new Chocolate_dark();
            case "white":
                return new Chocolate_white();
            case "milk":
                return new Chocolate_milk();
            case "candycane":
                return new HardCandy_CandyCane();
            case "lollipop":
                return new HardCandy_Lollipop();
            case "peppermint":
                return new HardCandy_Peppermint();
            default:
                return null;
        }
    }
}
