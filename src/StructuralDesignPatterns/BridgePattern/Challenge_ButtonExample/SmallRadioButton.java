package StructuralDesignPatterns.BridgePattern.Challenge_ButtonExample;

public class SmallRadioButton extends RadioButton {

  public void draw() {
    System.out.println("Setting size to small...");
    super.draw();
  }

}
