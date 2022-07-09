package CreationalDesignPattern.FactoryMethodPattern.CompleteFactoryMethodPattern;

public class CandyStore {

    private static final ChocolateFactory chocolateFactory = new ChocolateFactory();
    private static final HardCandyFactory hardCandyFactory = new HardCandyFactory();


    public static void main(String[] args) {
        chocolateFactory.getCandyPackage(12, "white");
        chocolateFactory.getCandyPackage(7, "dark");
        hardCandyFactory.getCandyPackage(14, "lollipop");
        hardCandyFactory.getCandyPackage(20, "peppermint");
    }
}
