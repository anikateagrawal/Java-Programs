package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Statements {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/google_play_game", "root", "");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Statement s = con.createStatement();
        ResultSet rs;
        try {
            rs = s.executeQuery("select * from emp where ename=" + name);
            while (rs.next()) {
                System.out.println(rs.getString(2) + " " + rs.getInt(4));
            }
        }catch (Exception e){
            System.out.println("error");
        }
        PreparedStatement ps=con.prepareStatement("SELECT * from emp where ename = ?");
        ps.setString(1,name);
        rs=ps.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getString(2)+" "+rs.getInt(4));
        }
        //CallableStatement cs=con.prepareCall("{call methodname(?,?)}");
        //cs.execute();
    }
}
