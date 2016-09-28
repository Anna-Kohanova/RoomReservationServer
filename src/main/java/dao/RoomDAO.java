package dao;

import entity.Room;

import java.util.List;

/**
 * Room Hibernate DAO interface.
 * Created by Ania on 28.09.2016.
 */
public interface RoomDAO {
    public List<Room> listRooms();
    public Room getRoomById(int id);
}
