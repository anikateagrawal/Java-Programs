package exception_handling;

import java.util.Scanner;

class UserDefinedException extends Exception
{
    UserDefinedException(String s)
    {
        super(s);
    }
}
public class Average_Marks {
    Scanner sc=new Scanner(System.in);
    String name;Integer[] marks;int sum;
    Average_Marks()throws UserDefinedException,NumberFormatException
    {
        sum=0;
        System.out.println("Enter name of student");
        String name=sc.nextLine();
        marks=new Integer[3];
        System.out.println("Enter marks of "+name);
        for (int i = 0; i < 3; i++) {
            marks[i] = Integer.valueOf(sc.next());
            if (marks[i] < 0) {
                throw new UserDefinedException("Marks cannot be Negative");
            } else if (marks[i] > 100) {
                throw new UserDefinedException("Marks cannot be more than 100");
            }
            sum = sum + marks[i];
        }
    }
    public static void main(String[] args)  {
        try {
            Average_Marks stu1=new Average_Marks();
            System.out.println("Average marks of "+stu1.name+" = "+stu1.sum/3.0);
            Average_Marks stu2=new Average_Marks();
            System.out.println("Average marks of "+stu2.name+" = "+stu2.sum/3.0);
        }
        catch (UserDefinedException|NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
