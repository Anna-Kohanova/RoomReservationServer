package service;

import entity.Room;

import java.util.List;

/**
 * Spring Service interface.
 * Created by Ania on 28.09.2016.
 */
public interface RoomService {
    public List<Room> listRooms();
    public Room getRoomById(int id);
}
