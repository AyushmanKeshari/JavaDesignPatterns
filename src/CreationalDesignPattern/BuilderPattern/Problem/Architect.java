package CreationalDesignPattern.BuilderPattern.Problem;

import java.awt.*;

public class Architect {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom(new Dimension(200,100), 132,2,Color.BLUE,
                2, 1, true,true);

        //Problem :  Cannot create different type of room as need to pass all values in constructor.
        //Constructor is too complex.
    }
}
