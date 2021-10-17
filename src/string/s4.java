package string;

import java.util.Scanner;

public class s4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(),b= sc.nextLine();
        String s="";
        int i;
        for(i=0;i<a.length();i++)
        {
            if(i==b.length())
            {
                s=s+a.substring(i);
                break;
            }
            else s=s+a.charAt(i)+b.charAt(i);
        }
        if(i<b.length())s=s+b.substring(i);
        System.out.println(s);
    }
}
