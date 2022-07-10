package StructuralDesignPatterns.BridgePattern.Problem_Shape;

import java.awt.*;

public class GreenTriangle extends Triangle{

  public void draw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    super.draw(graphics);
  }

}
