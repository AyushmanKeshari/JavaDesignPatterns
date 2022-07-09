package CreationalDesignPattern.FactoryMethodPattern.SimpleFactoryPattern;

public class CandyStore {

    private static final CandyFactory candyFactory = new CandyFactory();

    public static void main(String[] args) {
//        getCandyPackage(10, "chocolate");

        candyFactory.getCandyPackage(12,"chocolate");
        candyFactory.getCandyPackage(10,"hard candy");
    }




    //If new candy is added, below code need to changed everytime.   should not change store. -> Create Factory.
    /*
    public static ArrayList<Candy> getCandyPackage (int quantity, String type) {
        Candy candy = getCandy(type);
        ArrayList<Candy> candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

    public static Candy getCandy(String type) {
        switch (type) {
            case "hard candy":
                return new HardCandy();
            case "chocolate":
                return new Chocolate();
            default:
                return null;
        }
    }*/
}
