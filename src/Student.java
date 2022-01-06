import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    String name;int rollno,marks;

    public Student() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");name=sc.nextLine();
        System.out.println("Enter rollno");rollno=Integer.parseInt(sc.nextLine());
        System.out.println("Enter marks");marks=Integer.parseInt(sc.nextLine());
    }
}
class jdbc
{
    Connection con;
    PreparedStatement s;
    jdbc() throws ClassNotFoundException, SQLException {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atest","root","");
        }
        catch(Exception e)
        {

        }
    }
    void insert(String n,int r,int m) throws SQLException {
        s=con.prepareStatement("insert into student values(?,?,?)");
        s.setInt(1,r);
        s.setString(2,n);
        s.setInt(3,m);
        s.execute();
    }
    void delete(String n) throws SQLException {
        s=con.prepareStatement("delete from student where name =?");
        s.setString(1,n);
        s.execute();
    }
    void select(String n) throws SQLException {
        s=con.prepareStatement("select * from student where name = ?");
        s.setString(1,n);
        ResultSet rs=s.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        jdbc j=new jdbc();
        ArrayList obj=new ArrayList();
        for(int i=0;i<3;i++)
            obj.add(new Student());

        Pattern p=Pattern.compile("[\\w]*[jJ]");
        for(int i=0;i<3;i++) {
            Student o= (Student) obj.get(i);
            Matcher m = p.matcher((o.name));
            while(m.find())
            {
                j.insert(m.group(),o.rollno,o.marks);
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to select , 2 to delete");
        int c=Integer.parseInt(sc.nextLine());
        switch (c)
        {
            case 1:
                System.out.println("Enter name");
                String s=sc.nextLine();
                j.select(s);
                break;
            case 2:System.out.println("Enter name");
                String ss=sc.nextLine();
                j.delete(ss);
                break;
            default:
                System.out.println("wrong choice");
        }

    }
}