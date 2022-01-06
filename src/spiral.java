import java.util.Arrays;
import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();n= sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int ar[]=new int [m*n];
        int k=0,c=0,ir=0,ic=0,fr=m-1,fc=n-1;
        while(c!=m*n)
        {
            if(k%4==0)
            {
                for(int i=ir;i<=fr;i++)
                    ar[c++]=a[i][ic];
                ic++;
            }
            else if(k%4==1)
            {
                for(int i=ic;i<=fc;i++)
                    ar[c++]=a[fr][i];
                fr--;
            }
            else if(k%4==2)
            {
                for(int i=fr;i>=ir;i--)
                    ar[c++]=a[i][fc];
                fc--;
            }
            else
            {
                for(int i=fc;i>=ic;i--)
                    ar[c++]=a[ir][i];
                ir++;
            }
            k++;
        }
        for(int i=0;i<m*n;i++)
        {
            System.out.print(ar[i]+", ");
        }
        System.out.println("End");

    }
}
