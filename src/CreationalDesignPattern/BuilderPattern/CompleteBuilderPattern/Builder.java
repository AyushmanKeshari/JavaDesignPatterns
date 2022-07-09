package CreationalDesignPattern.BuilderPattern.CompleteBuilderPattern;

import java.awt.*;

//Not necessary in Classic Builder Pattern
public interface Builder {
    Builder setDimensions(Dimension dimensions);

    Builder setCeilingHeight(int ceilingHeight);

    Builder setFloorNumber(int floorNumber);

    Builder setWallColor(Color wallColor);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setNumberOfDoors(int numberOfDoors);
}
