package lesson9.dz;

import java.util.List;

public class House {

    private String name;

    List<Room> roomList;

    public House(String name, List<Room> roomList) {
        this.name = name;
        this.roomList = roomList;
    }

    public String getName() {
        return name;
    }

    public List<Room> getRoomList() {
        return roomList;
    }
}
