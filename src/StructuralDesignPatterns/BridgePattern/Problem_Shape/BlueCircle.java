package StructuralDesignPatterns.BridgePattern.Problem_Shape;

import java.awt.*;

public class BlueCircle extends Circle {

  public void draw(Graphics graphics) {
    graphics.setColor(Color.BLUE);
    super.draw(graphics);
  }

}
