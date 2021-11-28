package jdbc;

import java.sql.*;

public class Database_connect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/google_play_game", "root", "");
            System.out.println("Connection Established successfully");
            con.close();
        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println(e);
        }
    }
}
