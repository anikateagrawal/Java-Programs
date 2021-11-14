package Menu;

import java.util.Scanner;

public class Menu_driven {
    static void prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)if(n%i==0)c++;
        if(c==2) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
    static void fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)f=f*i;
        System.out.println(f);
    }
    static void fibo(int n)
    {
        if(n==1) System.out.println("0");
        else if(n>1)
        {
            int a=0,b=1,c;
            System.out.print("0 1 ");
            for(int i=2;i<n;i++)
            {
                c=a+b;
                System.out.print(c+" ");
                a=b;b=c;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int ch=0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Menu:\n1. check prime\n2.print factorial\n3.print fibonacci series\n4.quit");
            ch= scanner.nextInt();
            switch (ch)
            {
                case 1->{System.out.println("Enter number");
                int n= scanner.nextInt();prime(n);}
                case 2->{System.out.println("Enter number");
                int n= scanner.nextInt();fact(n);}
                case 3->{System.out.println("Enter number");
                int n= scanner.nextInt();fibo(n);}
                case 4->System.exit(0);
                default -> System.out.println("Wrong choice");
            }
        }
    }
}
