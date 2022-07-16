package BehavioralDesignPatterns.Part1.InterpreterPattern.Solution_GrammerMistakeChecker;

public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence";

    // Interpret the sentence here
    NoRepeatedWords noRepeatedWords = new NoRepeatedWords();
    context = noRepeatedWords.interpret(context);

    System.out.println(context);

  }

}
