package string;

import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(new_string(s));
    }
    static String new_string(String s)
    {
        String s2="";
        if(s.length()>1) {
            for (int i = 0; i < s.length(); i++) {
                s2 = s2 + s.charAt(0) + s.charAt(1);
            }
            return s2;
        }
        else
        return s;
    }
}
