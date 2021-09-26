package p1;
import java.util.Scanner;

public class Ascii {
    int[] arr;
    Scanner s=new Scanner(System.in);
    Ascii()
    {
        System.out.println("Enter size of array");
        int size =s.nextInt();
        arr=new int[size];
        for(var i=0;i<size;i++)
        {
            System.out.println("Enter a ascii number");
            arr[i]=s.nextInt();
        }
    }
    void display()
    {
        for(var i:arr)
        {
            System.out.println((char)i);
        }
    }
}
class AsciiMain
{
    public static void main(String[] args) {
        Ascii obj=new Ascii();
        obj.display();
    }
}
