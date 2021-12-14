package jdbc;

import java.sql.*;

public class Callable_ {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/Bjdbc","root","");
        Statement s = con.createStatement();

        // using here CallableStatement object to call a stored procedure declared in phpmyadmin with name "GetData"
        CallableStatement cs = con.prepareCall("{call GetData()}");
        cs.execute();

        // Creation of resultset object and  populate with data
        ResultSet rs =cs.getResultSet();
        // printing the values from the resultset
        while(rs.next())
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
        }

    }
}