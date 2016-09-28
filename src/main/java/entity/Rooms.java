package entity;

import java.util.List;

/**
 * Used for transferring data from server side to client.
 * Created by Ania on 25.09.2016.
 */
public class Rooms {
    private List<Room> allRooms;

    public List<Room> getAllRooms() {
        return allRooms;
    }

    public void setAllRooms(List<Room> allRooms) {
        this.allRooms = allRooms;
    }
}
