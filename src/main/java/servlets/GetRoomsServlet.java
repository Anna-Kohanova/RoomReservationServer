package servlets;

import com.google.gson.Gson;
import model.Room;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet for interacting with client side
 * Created by Ania on 17.09.2016.
 */

@WebServlet(name = "GetRoomsServlet")
public class GetRoomsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("==========================");

        Room r1 = new Room("asd", 1);
        Room r2 = new Room("qwert", 2);

        List<Room> rooms = new ArrayList<Room>();
        rooms.add(r1);
        rooms.add(r2);

        String json = new Gson().toJson(rooms);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
