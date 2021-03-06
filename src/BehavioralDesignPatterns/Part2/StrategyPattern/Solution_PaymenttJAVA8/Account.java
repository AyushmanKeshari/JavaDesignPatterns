package BehavioralDesignPatterns.Part2.StrategyPattern.Solution_PaymenttJAVA8;

public interface Account {

    void makePayment(int amount);

    Account bankAccount = (int amount) -> System.out.println("Payment of $" + amount + " made from bank account.");
    Account payPalAccount = (int amount) -> System.out.println("Payment of $" + amount + " made from PayPal.");


}
