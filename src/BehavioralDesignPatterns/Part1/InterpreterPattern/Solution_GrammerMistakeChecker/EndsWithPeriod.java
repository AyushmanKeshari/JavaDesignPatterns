package BehavioralDesignPatterns.Part1.InterpreterPattern.Solution_GrammerMistakeChecker;

public class EndsWithPeriod implements Expression {
    @Override
    public String interpret(String context) {
        context = HelperMethods.endsWithPeriod(context);
        return context;
    }
}
