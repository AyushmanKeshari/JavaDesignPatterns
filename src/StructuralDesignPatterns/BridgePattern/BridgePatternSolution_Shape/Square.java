package StructuralDesignPatterns.BridgePattern.BridgePatternSolution_Shape;

import java.awt.*;

public class Square extends Shape {

  ColorShape colorShape;

  public Square(ColorShape shape) {
    this.colorShape = shape;
  }

  public void draw(Graphics graphics) {
    colorShape.setColor(graphics);
    graphics.fillRect(5, 15, 50, 50);
  }

}
