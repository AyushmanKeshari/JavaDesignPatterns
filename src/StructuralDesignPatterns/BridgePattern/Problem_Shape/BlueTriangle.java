package StructuralDesignPatterns.BridgePattern.Problem_Shape;

import java.awt.*;

public class BlueTriangle extends Triangle {

  public void draw(Graphics graphics) {
    graphics.setColor(Color.BLUE);
    super.draw(graphics);
  }

}
