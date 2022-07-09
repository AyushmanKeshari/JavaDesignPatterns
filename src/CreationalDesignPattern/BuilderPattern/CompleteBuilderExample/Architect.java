package CreationalDesignPattern.BuilderPattern.CompleteBuilderExample;

import java.util.ArrayList;

//Director
public class Architect {
    public static void main(String[] args) {
//        Room room1 = new RoomBuilder().setFloorNumber(2).createRoom();
//        Room room2 = new RoomBuilder().setFloorNumber(1).createRoom();
//
//
//        //Need to add room one by one, Instead use RoomListBuilder
//        ArrayList<Room> rooms = new ArrayList<>();
//        rooms.add(room1);
//        rooms.add(room2);
//
//        House house = new House(rooms);
//
//
//
//
//
//        ArrayList<Room> rooms1 = new RoomListBuilder().addList()
//                .addRoom(room1)
//                .addRoom(room2)
//                .buildList();
//
//        House house1 = new House(rooms1);





        ArrayList<Room> rooms2 = new RoomListBuilder().addList()
                .addRoom().setFloorNumber(1).addRoomToList()
                .addRoom().setFloorNumber(2).addRoomToList()
                .buildList();

        House house2 = new House(rooms2);

    }
}
