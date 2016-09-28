package controllers;

import entity.Room;
import entity.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import service.RoomService;

/**
 * Spring controller class to take care of client requests, use service classes to perform database specific operations
 * Created by Ania on 24.09.2016.
 */

@RestController
public class RoomController {
    private RoomService roomService;

    @Autowired(required=true)
    @Qualifier(value="roomService")
    public void setRoomService(RoomService rs){
        this.roomService = rs;
    }

    @RequestMapping(value = "/getAllRooms", method = RequestMethod.GET)
    public Rooms getAllRooms() {
        Rooms rooms = new Rooms();
        rooms.setAllRooms(this.roomService.listRooms());
        return rooms;
    }
}
