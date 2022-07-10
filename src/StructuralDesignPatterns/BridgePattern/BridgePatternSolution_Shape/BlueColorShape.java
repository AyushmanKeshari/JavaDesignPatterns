package StructuralDesignPatterns.BridgePattern.BridgePatternSolution_Shape;

import java.awt.*;

public class BlueColorShape implements ColorShape {
    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.BLUE);
    }
}
