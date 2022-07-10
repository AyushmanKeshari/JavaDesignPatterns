package StructuralDesignPatterns.BridgePattern.Challenge_ButtonExample;

public class LargeCheckboxButton extends CheckboxButton {

  public void draw() {
    System.out.println("Setting size to large...");
    super.draw();
  }

}
