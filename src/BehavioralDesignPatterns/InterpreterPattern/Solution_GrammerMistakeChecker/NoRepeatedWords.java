package BehavioralDesignPatterns.InterpreterPattern.Solution_GrammerMistakeChecker;

import java.util.Arrays;
import java.util.List;

public class NoRepeatedWords implements Expression {

    private FirstLetterUpperCase firstLetterUpperCase = new FirstLetterUpperCase();

    @Override
    public String interpret(String context) {
        context = HelperMethods.noRepeatedWords(context);
        context = firstLetterUpperCase.interpret(context);
        return context;
    }
}
