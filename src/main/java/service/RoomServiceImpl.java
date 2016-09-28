package service;

import dao.RoomDAO;
import model.Room;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ania on 28.09.2016.
 */

@Service
public class RoomServiceImpl implements RoomService {

    private RoomDAO roomDAO;

    public void setRoomDAO(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }

    @Transactional
    public List<Room> listRooms() {
        return this.roomDAO.listRooms();
    }

    @Transactional
    public Room getRoomById(int id) {
        return this.roomDAO.getRoomById(id);
    }
}
