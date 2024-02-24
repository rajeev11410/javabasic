// Inserting data in the table we created earlier using Scanner class to take input from keyboard.

import java.sql.*;
import java.util.*;

public class JDBC4 {
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

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Enter your city name: ");
            String city = sc.nextLine();

            // setting the values to query

            prs.setString(1, name);
            prs.setString(2, city);

            prs.executeUpdate();

            System.out.println("Inserted the data!");

            con.close(); // connection is closed here!

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
