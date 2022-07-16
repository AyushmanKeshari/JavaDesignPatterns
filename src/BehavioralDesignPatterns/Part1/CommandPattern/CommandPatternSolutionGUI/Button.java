package BehavioralDesignPatterns.Part1.CommandPattern.CommandPatternSolutionGUI;

public class Button {

  String text;

  public Button(String text) {
    this.text = text;
  }

  public void click(Command command) {
    command.execute();
  }

}
