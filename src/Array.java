import java.util.Scanner;

public class Array {
    int[] arr;
    static Scanner s=new Scanner(System.in);
    Array()
    {
        System.out.println("Enter size of array");
        int size =s.nextInt();
        arr=new int[size];
        for(var i=0;i<size;i++)
        {
            System.out.println("Enter a number");
            arr[i]=s.nextInt();
        }
    }
    void check()
    {
        System.out.println("Enter number to check in array");
        int n=s.nextInt();
        var i=0;
        for (;i<arr.length;i++)
        {
            if(arr[i]==n) {
                System.out.println(n + " is present at index " + i);
                break;
            }
        }
        if(i==arr.length) System.out.println(-1);

    }
}
class ArrayMain
{
    public static void main(String[] args) {
        Array obj=new Array();
        obj.check();
    }
}
