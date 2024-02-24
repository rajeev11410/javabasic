//Insertion of large images in the database
package Practice;

import java.sql.*;
import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection c = ConnectionProvider.getConnection();

            String query = "insert into myimages(pic) values(?)";

            PreparedStatement pst = c.prepareStatement(query);

            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File fi = jfc.getSelectedFile();

            FileInputStream fin = new FileInputStream(fi);

            pst.setBinaryStream(1, fin, fin.available());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "success");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
