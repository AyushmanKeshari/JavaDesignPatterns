package CreationalDesignPattern.BuilderPattern.Solution;

import java.awt.*;

//Director
public class Architect {
    public static void main(String[] args) {
        Bedroom bedroom = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(132)
                .setFloorNumber(2).setWallColor(Color.BLUE).setNumberOfWindows(2).setNumberOfDoors(1)
                .setIsDouble(true).setHasSuite(true).createBedroom();
    }
}
