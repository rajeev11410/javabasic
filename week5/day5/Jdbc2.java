// Creating a table in the MySQL database using java program and JDBC.

import java.sql.*;

public class JDBC2 {
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
            String myQuery = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            // create a statement
            Statement st = con.createStatement();
            st.executeUpdate(myQuery);

            System.out.println("table has been created in the database!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
