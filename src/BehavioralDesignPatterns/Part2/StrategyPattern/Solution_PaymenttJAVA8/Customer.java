package BehavioralDesignPatterns.Part2.StrategyPattern.Solution_PaymenttJAVA8;

public class Customer {

    public void makePayment(int amount, Account account) {
        account.makePayment(amount);
    }

}
