package StructuralDesignPatterns.BridgePattern.Problem_Shape;

import java.awt.*;

public abstract class Square extends Shape {

  public void draw(Graphics graphics) {
    graphics.fillRect(5, 15, 50, 50);
  }

}
