package Practice;

import java.sql.*;

public class SelectJDBC {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();

            String q = "select * from table1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String city = rs.getString(3);

                System.out.println(id + " : " + name + " : " + city);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
