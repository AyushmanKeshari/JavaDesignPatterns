package StructuralDesignPatterns.BridgePattern.BridgePatternSolution_Shape;

import java.awt.*;

public class Circle extends Shape {

  ColorShape colorShape;

  public Circle (ColorShape shape){
    this.colorShape = shape;
  }

  public void draw(Graphics graphics) {
    colorShape.setColor(graphics);
    graphics.fillOval(75, 15, 50, 50);
  }

}
