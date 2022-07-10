package StructuralDesignPatterns.DecoratorPattern.DecoratorPatternDrawComponent;

import javax.swing.*;
import java.awt.*;

//Using Swing: No need to be familiar
public class Canvas extends JPanel {

  Component circle1 = new Circle(15, 15);
  Component circle2 = new Circle(75, 15);
  Component circle3 = new Circle(135, 15);

  public static void main(String[] args) {
    // Creates a canvas to draw on
    JFrame frame = new JFrame();
    frame.setSize(400, 400);
    frame.add(new Canvas());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public void paint(Graphics graphics) {
    circle1.draw(graphics);

    circle2 = new ComponentsWithRedBorder(circle2);  //Changing component behavior dynamically.
    //Can add any type of decoration.   Ex: ComponentsWithYellowFill(circle2)

    circle2.draw(graphics);
    circle3.draw(graphics);
  }

}
