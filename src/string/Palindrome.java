package string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        if(str.equals((new StringBuffer(str)).reverse().toString())) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
