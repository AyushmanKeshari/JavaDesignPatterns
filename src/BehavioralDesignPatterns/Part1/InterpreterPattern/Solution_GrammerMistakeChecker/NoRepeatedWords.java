package BehavioralDesignPatterns.Part1.InterpreterPattern.Solution_GrammerMistakeChecker;

public class NoRepeatedWords implements Expression {

    private FirstLetterUpperCase firstLetterUpperCase = new FirstLetterUpperCase();

    @Override
    public String interpret(String context) {
        context = HelperMethods.noRepeatedWords(context);
        context = firstLetterUpperCase.interpret(context);
        return context;
    }
}
