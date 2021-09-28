package p1;
import java.util.Scanner;

public class Student {
    private String name;
    private int rollno;
    Scanner s=new Scanner(System.in);
    Student()
    {
        System.out.println("Enter name");
        name=s.nextLine();
        System.out.println("Enter rollno.");
        rollno=s.nextInt();
    }

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    void display()
    {
        System.out.println(name+" "+rollno);
    }

}
class StudentMain
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student obj=new Student();
        System.out.println("Enter name and roll no.");
        Student obj2=new Student(s.nextLine(),s.nextInt());
        obj.display();
        obj2.display();
    }
}
