package StructuralDesignPatterns.BridgePattern.Challenge_ButtonExample;

public class MediumRadioButton extends RadioButton {

  public void draw() {
    System.out.println("Setting size to medium...");
    super.draw();
  }

}
