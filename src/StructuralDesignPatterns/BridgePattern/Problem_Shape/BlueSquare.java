package StructuralDesignPatterns.BridgePattern.Problem_Shape;

import java.awt.*;

public class BlueSquare extends Square {

  public void draw(Graphics graphics) {
    graphics.setColor(Color.BLUE);
    super.draw(graphics);
  }

}
