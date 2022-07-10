package StructuralDesignPatterns.BridgePattern.Problem_Shape;

import java.awt.*;

public abstract class Circle extends Shape {

  public void draw(Graphics graphics) {
    graphics.fillOval(75, 15, 50, 50);
  }



}
