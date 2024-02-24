package Practice;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    static Connection con;

    public static Connection getConnection() {

        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "atharv@sqldb24");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
