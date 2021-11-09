package wrapper_class;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Given Number "+n);
        System.out.println("Binary Equivalent "+Integer.toBinaryString(n));
        System.out.println("Hexa Decimal Equivalent "+Integer.toHexString(n));
        System.out.println("Octal Equivalent "+Integer.toOctalString(n));
    }
}
