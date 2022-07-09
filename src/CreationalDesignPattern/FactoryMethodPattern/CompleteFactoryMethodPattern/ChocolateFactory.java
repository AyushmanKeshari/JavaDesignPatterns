package CreationalDesignPattern.FactoryMethodPattern.CompleteFactoryMethodPattern;

public class ChocolateFactory extends CandyFactory{

    @Override
    public Candy getCandy(String section) {
        switch (section) {
            case "dark":
                return new Chocolate_dark();
            case "white":
                return new Chocolate_white();
            case "milk":
                return new Chocolate_milk();
            default:
                return null;
        }
    }

}
