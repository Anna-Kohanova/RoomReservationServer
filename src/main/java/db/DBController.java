package db;

import java.sql.Connection;

/**
 * Database controller for requests execution
 * Created by Ania on 21.09.2016.
 */
public class DBController {
    private Connection connection;

    public DBController() {
        connection = new DBConnection().getDBConnection();
    }

}
