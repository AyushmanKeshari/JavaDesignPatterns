package BehavioralDesignPatterns.Part1.InterpreterPattern.Solution_GrammerMistakeChecker;

public class FirstLetterUpperCase implements Expression {

    private EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

    @Override
    public String interpret(String context) {
        context = HelperMethods.firstLetterLowerCase(context);
        context = endsWithPeriod.interpret(context);
        return context;
    }
}
