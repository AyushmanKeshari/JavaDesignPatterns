package StructuralDesignPatterns.BridgePattern.Problem_Shape;

import java.awt.*;

public class RedTriangle extends Triangle{

  public void draw(Graphics graphics) {
    graphics.setColor(Color.RED);
    super.draw(graphics);
  }

}
