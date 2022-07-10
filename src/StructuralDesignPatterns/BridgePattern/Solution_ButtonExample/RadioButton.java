package StructuralDesignPatterns.BridgePattern.Solution_ButtonExample;

public class RadioButton extends Button {

  ButtonSize buttonSize;

  public RadioButton(ButtonSize size1) {
    this.buttonSize = size1;
  }

  public void draw() {
    buttonSize.setSize();
    System.out.println("Drawing a radio button.\n");
  }

}
