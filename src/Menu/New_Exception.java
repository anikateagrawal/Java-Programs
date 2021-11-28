package Menu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Scanner;

public class New_Exception {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Menu\n1.IOException\n2.SQLException\n3.ClassNotFoundException\n4.InvocationTargetException\n5.FileNotFoundException\n6.ArraysIndexOutOfBoundsException\n7.NumberFormatException\n8.ArithmeticException\n9.NullPointerException\n10.StringIndexOutOfBoundsException\n11.Exit");
            int ch=sc.nextInt();
            try {
                switch (ch) {
                    case 1 -> throw new IOException();
                    case 2 -> throw new SQLException();
                    case 3 -> throw new ClassNotFoundException();
                    case 4 -> { //throw new InvocationTargetException();
                    }
                    case 5 -> throw new FileNotFoundException();
                    case 6 -> throw new ArithmeticException();
                    case 7 -> throw new NumberFormatException();
                    case 8 -> throw new ArithmeticException();
                    case 9 -> throw new NullPointerException();
                    case 10 -> throw new StringIndexOutOfBoundsException();
                    case 11-> System.exit(0);
                    default -> System.out.println("Wrong Choice");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
