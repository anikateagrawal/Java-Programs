import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Internal {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Internal_Marks", "root", "");
        String phone="9319903030 tyttty uhuyu 07676767697";
        String name="Aditya Ani Ram";
        Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Pattern p2=Pattern.compile("[ar][a-zA-Z]*",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(phone);
        Matcher m2=p2.matcher(name);
        PreparedStatement pr=con.prepareStatement("Insert into info values(?,?)");
        String[] ar1=new String[10];
        long[] ar2=new long[10];
        int c=0,c1=0;
        while(m2.find())
        {
            ar1[c++]=m2.group();
           // System.out.println(ar1[0]);
        }
        while(m.find())
        {
            ar2[c1++]=Long.parseLong(m.group());
        }
        try {
            if (c >= 1 && c1 >= 1) {
                for(int i=0;i<Math.min(c,c1);i++)
                {
                    pr.setLong(1,ar2[i]);
                    pr.setString(2,ar1[i]);
                    pr.execute();
                }

            } else {
                throw new UserException("Invalid String");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
