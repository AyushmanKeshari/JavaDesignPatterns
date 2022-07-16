package BehavioralDesignPatterns.Part2.StrategyPattern.Solution_Payment;

public class PayFromBank implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Payment of $" + amount + " made from bank account.");
    }
}
