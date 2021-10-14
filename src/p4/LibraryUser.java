package p4;

import java.util.Objects;
import java.util.Scanner;

public interface LibraryUser {
    void registerAccount();
    void requestBook();
}
class KidUser implements LibraryUser
{
    int age;
    String bookType;
    public void registerAccount()
    {
        if(age<12) System.out.println("You have successfully registered under a Kids Account");
        else System.out.println("Sorry age must be less than 12 to register as a kid");
    }
    public void requestBook()
    {
        if(bookType.equalsIgnoreCase("Kids")) System.out.println("Book issued successfully,please return the book within 10 days");
        else System.out.println("Oops you are allowed to take only kids books");
    }
}
class AdultUser implements LibraryUser
{
    int age;
    String bookType;
    public void registerAccount()
    {
        if(age>=12) System.out.println("You have successfully registered under an Adult Account");
        else System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }
    public void requestBook()
    {
        if(bookType.equalsIgnoreCase("Fiction")) System.out.println("Book issued successfully,please return the book within 7 days");
        else System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}
class LibraryInterfaceDemo
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        KidUser obj=new KidUser();
        System.out.println("Enter age");
        obj.age=s.nextInt();
        obj.registerAccount();
        System.out.println("Enter book type");
        obj.bookType=s.next();
        obj.requestBook();
        AdultUser ob=new AdultUser();
        System.out.println("Enter age");
        ob.age=s.nextInt();
        ob.registerAccount();
        System.out.println("Enter book type");
        ob.bookType=s.next();
        ob.requestBook();
    }
}
