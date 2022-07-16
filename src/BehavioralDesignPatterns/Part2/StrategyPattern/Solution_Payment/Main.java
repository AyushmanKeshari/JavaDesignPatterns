package BehavioralDesignPatterns.Part2.StrategyPattern.Solution_Payment;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.makePayment(new PayFromBank(),100);
    }

}
