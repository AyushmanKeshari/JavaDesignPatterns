package BehavioralDesignPatterns.Part1.MomentoPattern.Solution_Calculator;

public class Calculator {

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(10);
        System.out.println(adder.getResult());

        adder.save();
        adder.add(20);
        System.out.println(adder.getResult());
        adder.undo();
        System.out.println(adder.getResult());
    }

}
