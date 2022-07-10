package StructuralDesignPatterns.BridgePattern.Challenge_ButtonExample;

public class MediumCheckboxButton extends CheckboxButton {

  public void draw() {
    System.out.println("Setting size to medium...");
    super.draw();
  }

}
