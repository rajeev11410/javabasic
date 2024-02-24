package Practice;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateJDBC {
    public static void main(String[] args) {
        try {
            Connection myc = ConnectionProvider.getConnection();
            
            String myquery = "update table1 set tName = ?, tCity = ? where tId = ?";

            BufferedReader ber = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name: ");
            String name = ber.readLine();

            System.out.println("Enter city name: ");
            String city = ber.readLine(); 

            System.out.println("Enter the student ID: ");
            int id = Integer.parseInt(ber.readLine());


            PreparedStatement pst = myc.prepareStatement(myquery);

            pst.setString(1, name);
            pst.setString(2, city);
            pst.setInt(3, id);

            pst.executeUpdate();

            System.out.println("Done!");

            myc.close();
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}
