package dao;

import controllers.RoomController;
import model.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Ania on 28.09.2016.
 */
public class RoomDAOImpl implements RoomDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public List<Room> listRooms() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Room> roomsList = session.createQuery("from " + Room.class).list();
        return roomsList;
    }

    public Room getRoomById(int id) {
        return null;
    }
}
