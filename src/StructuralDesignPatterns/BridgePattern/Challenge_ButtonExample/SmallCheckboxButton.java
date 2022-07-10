package StructuralDesignPatterns.BridgePattern.Challenge_ButtonExample;

public class SmallCheckboxButton extends CheckboxButton {

  public void draw() {
    System.out.println("Setting size to small...");
    super.draw();
  }


}
