package StructuralDesignPatterns.BridgePattern.Solution_ButtonExample;

public class DropdownButton extends Button {

  ButtonSize size;

  public DropdownButton(ButtonSize size1) {
    this.size = size1;
  }

  public void draw() {
    size.setSize();
    System.out.println("Drawing a dropdown button.\n");
  }

}
