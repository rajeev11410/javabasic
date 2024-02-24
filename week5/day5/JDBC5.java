// Inserting image data in a table called myimages using setBinaryStream() method of PreparedStatement interface.

import java.sql.*;
import java.io.*;

public class JDBC5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection dc = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "atharv@sql24db");

            String q = "insert into myimages(pic) values(?)";

            PreparedStatement st = dc.prepareStatement(q);
            FileInputStream fin = new FileInputStream("C:\\Users\\Microsoft\\Desktop\\Screenshot (1)");
            st.setBinaryStream(1, fin, fin.available());
            st.executeUpdate();

            System.out.println("Done...");
        } catch (Exception e) {
            System.out.println("Error occured!");
            e.printStackTrace();
        }
    }
}
