package string;

import java.util.Scanner;

public class s5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(ss(s,n));
    }
    static String ss(String s,int n)
    {
        String ss="";
        for(int i=0;i<n;i++)
        {
            ss=ss+s.substring(s.length()-n);
        }
        return ss;
    }
}
