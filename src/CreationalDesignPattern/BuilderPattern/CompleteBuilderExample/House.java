package CreationalDesignPattern.BuilderPattern.CompleteBuilderExample;

import java.util.ArrayList;

public class House {

    private ArrayList<Room> roomArrayList;

    public House(ArrayList<Room> roomArrayList) {
        this.roomArrayList = roomArrayList;
    }
}
