package BehavioralDesignPatterns.Part2.StrategyPattern.Solution_PaymenttJAVA8;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.makePayment(100, Account.bankAccount);

    }

}
