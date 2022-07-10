package StructuralDesignPatterns.BridgePattern.Challenge_ButtonExample;

public class SmallDropdownButton extends DropdownButton {

  public void draw() {
    System.out.println("Setting size to small...");
    super.draw();
  }

}
