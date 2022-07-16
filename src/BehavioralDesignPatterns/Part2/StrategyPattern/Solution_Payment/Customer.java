package BehavioralDesignPatterns.Part2.StrategyPattern.Solution_Payment;

public class Customer {

    public void makePayment(Payment payment, int amount) {
        payment.pay(amount);
    }

}
