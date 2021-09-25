import java.util.Scanner;

public class Only1_4 {
    int[] arr;
    Scanner s=new Scanner(System.in);
    Only1_4()
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
        int i=0;
        for(;i<arr.length;i++)
        {
            if(arr[i]!=1&&arr[i]!=4)break;
        }
        if(i!=arr.length) System.out.println("False");
        else System.out.println("True");
    }
}
class Only1_4Main
{
    public static void main(String[] args) {
        Only1_4 obj=new Only1_4();
        obj.check();
    }
}