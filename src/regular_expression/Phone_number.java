package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String target=sc.nextLine();
        Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Pattern p1=Pattern.compile("[a]+\\S");
        Matcher m=p.matcher(target);
        int c=0;
        while(m.find())
        {
            c++;
            System.out.println(m.start()+"  "+m.end()+"  "+m.group());
        }
        System.out.println(c);
        String s1="9999555566";
        System.out.println(s1.matches("(0|91)?[7-9][0-9]{9}"));
    }
}
