package BehavioralDesignPatterns.Part1.CommandPattern.GUIProblem;

public class GUI {

  private static Document document = new Document();

  public static void main(String[] args) {

    Button saveButton = new Button("Save");
    Button printButton = new Button("Print");

    saveButton.click();
    printButton.click();

  }


}
