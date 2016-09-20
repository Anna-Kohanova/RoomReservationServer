package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class for database connection establishing
 * Created by Ania on 21.09.2016.
 */
public class DBConnection {
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306";
    private final static String USER = "root";
    private final static String PASS = "root";

    public static Connection getDBConnection() {
		Connection connection = null;

		try {
			Class.forName(DRIVER);
			connection = (Connection) DriverManager.getConnection(URL, USER, PASS);

		} catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
