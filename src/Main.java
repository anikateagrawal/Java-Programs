import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check");
        int n=s.nextInt();
        int rev=0,d,m=n;
        while(m>0)
        {
            d=m%10;
            rev=rev*10+d;
            m=m/10;
        }
        if(rev==n)
            System.out.println(n+" is a palindrome");
        else System.out.println(n+" is not a palindrome");
    }
}
