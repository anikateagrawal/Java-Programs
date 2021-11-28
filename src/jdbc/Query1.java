package jdbc;

import java.sql.*;

public class Query1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/google_play_game","root", "");
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from emp");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        rs=s.executeQuery("select * from emp where sal>=1000 and sal<=2000");
        while(rs.next())
        {
            System.out.println(rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
        }

    }
}
