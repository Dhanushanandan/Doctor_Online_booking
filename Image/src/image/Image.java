package image;

import java.sql.*;

public class Image {

    public static void main(String[] args) {

        Connection con = null;
        try {
            final String url = "jdbc:mysql://localhost/image";
            final String name = "root";
            final String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, name, pass);

            PreparedStatement pstmt = con.prepareStatement("insert into image values (?,?)");
            pstmt.setString(1, "amal");
            FileInputString fil=new FileInputString("C:\\Users\\danus\\Downloads");
            pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
