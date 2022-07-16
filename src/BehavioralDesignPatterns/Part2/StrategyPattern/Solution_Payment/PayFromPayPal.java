package BehavioralDesignPatterns.Part2.StrategyPattern.Solution_Payment;

public class PayFromPayPal implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Payment of $" + amount + " made from PayPal.");
    }
}
