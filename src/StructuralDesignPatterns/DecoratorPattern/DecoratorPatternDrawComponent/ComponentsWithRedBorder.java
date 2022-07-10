package StructuralDesignPatterns.DecoratorPattern.DecoratorPatternDrawComponent;

import java.awt.*;

public class ComponentsWithRedBorder implements Component {

    Component decoratedComponent;

    public ComponentsWithRedBorder (Component component) {
        this.decoratedComponent = component;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        decoratedComponent.draw(graphics);

        graphics.setColor(Color.BLACK); //Else all component will be black.
    }
}
