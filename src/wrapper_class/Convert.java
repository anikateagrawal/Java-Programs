package wrapper_class;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        System.out.println("Given Number "+args[0]);
        System.out.println("Binary Equivalent "+Integer.toBinaryString(Integer.parseInt(args[0])));
        System.out.println("Hexa Decimal Equivalent "+Integer.toHexString(Integer.parseInt(args[0])));
        System.out.println("Octal Equivalent "+Integer.toOctalString(Integer.parseInt(args[0])));
    }
}
