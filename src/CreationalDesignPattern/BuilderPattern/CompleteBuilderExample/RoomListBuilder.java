package CreationalDesignPattern.BuilderPattern.CompleteBuilderExample;

import java.util.ArrayList;

public class RoomListBuilder {
    ArrayList<Room> listOfRooms;

    public RoomListBuilder addList() {
        this.listOfRooms = new ArrayList<Room>();
        return this;
    }

    public RoomBuilder addRoom() {
        return new RoomBuilder(this);
    }

    public RoomListBuilder addRoom(Room room) {
        listOfRooms.add(room);
        return this;
    }

    public ArrayList<Room> buildList() {
        return listOfRooms;
    }

}
