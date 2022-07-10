package StructuralDesignPatterns.BridgePattern.Problem_Shape;

import java.awt.*;

public class GreenSquare extends Square {

  public void draw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    super.draw(graphics);
  }

}
