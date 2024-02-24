// Creating a connection between java program and MySQL database

import java.sql.*;

public class JDBC1{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "atharv@sql24db";

            Connection cn = DriverManager.getConnection(url, username, password);

            if(cn.isClosed()){
                System.out.println("Connection isn't established");
            }else{
                System.out.println("Connection is established!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

