package StructuralDesignPatterns.BridgePattern.Solution_ButtonExample;

public class CheckboxButton extends Button {

  ButtonSize size;

  public CheckboxButton(ButtonSize size1) {
    this.size = size1;
  }

  public void draw() {
    size.setSize();
    System.out.println("Drawing a checkbox button.\n");
  }

}
