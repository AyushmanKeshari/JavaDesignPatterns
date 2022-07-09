package CreationalDesignPattern.BuilderPattern.CompleteBuilderPattern;

import java.awt.*;

public class Architect {
    public static void main(String[] args) {
        Bedroom bedroom = new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeilingHeight(132)
                .setFloorNumber(2).setWallColor(Color.BLUE).setNumberOfWindows(2).setNumberOfDoors(1)
                .setIsDouble(true).setHasSuite(true).createBedroom();

        Bedroom bedroom1 = new BedroomBuilder().setDimensions(new Dimension(300,250)).createBedroom();

        Kitchen kitchen = new KitchenBuilder().setDimensions(new Dimension(50, 100)).setCeilingHeight(70)
                .setFloorNumber(1).setWallColor(Color.YELLOW).createKitchen();
    }
}
