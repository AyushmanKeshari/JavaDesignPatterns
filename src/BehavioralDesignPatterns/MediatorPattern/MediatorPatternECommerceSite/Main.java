package BehavioralDesignPatterns.MediatorPattern.MediatorPatternECommerceSite;

public class Main {

    public static void main(String[] args) {

//    Customer customer = new Customer("123 Sunny Street");
//    customer.buy("pens", 3);

        Mediator mediator = new Mediator();
        mediator.buy("pens", 3);
    }


}
