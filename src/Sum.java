import java.util.Scanner;

public class Sum {
    int[] arr;
    Scanner s=new Scanner(System.in);
    Sum()
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
    void sum()
    {
        int sum=0,f=0,s2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==6)
            {
                f=1;
            }
            if(f==1)
            {
                s2=s2+arr[i];
                if(arr[i]==7){s2=0;f=0;}
            }
            else sum=sum+arr[i];
        }sum=sum+s2;
        System.out.println(sum);
    }
}
class SumMain
{
    public static void main(String[] args) {
        Sum obj=new Sum();
        obj.sum();
    }
}