// Inserting data in the table we created earlier using setString() method of PreparedStatement interface.

import java.sql.*;

public class JDBC3 {
    public static void main(String[] args) {
        try {
            // loading class driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating a connection
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "atharv@sql24db";

            Connection con = DriverManager.getConnection(url, username, password);

            // creating a query
            String myQuery = "insert into table1(tName, tCity) values(?,?)";

            // getting the PreparedStatement
            PreparedStatement prs = con.prepareStatement(myQuery);

            // setting the values to query

            prs.setString(1, "Durgadas");
            prs.setString(2, "Jadhav");

            prs.executeUpdate();

            System.out.println("Inserted the data!");

            con.close(); // connection is closed here!

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
