package dao;

import entity.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Hibernate Room DAO implementation.
 * Created by Ania on 28.09.2016.
 */
public class RoomDAOImpl implements RoomDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    public List<Room> listRooms() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Room> roomsList = (List<Room>) session.createQuery("from entity.Room").list();
        return roomsList;
    }

    public Room getRoomById(int id) {
        return null;
    }
}
