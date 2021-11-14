package exception_handling;

import java.util.Scanner;

public class Array_Index_Out_Of_Bound
{
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the number of elements in the array");
            Integer n=Integer.valueOf(sc.next());
            Integer[] ar=new Integer[n];
            System.out.println("Enter the elements in the array");
            for(int i=0;i<n;i++)ar[i]=Integer.valueOf(sc.next());
            System.out.println("Enter the index of the array you want to access");
            Integer v= Integer.valueOf(sc.next());
            System.out.println("The array element at index "+v+"="+ar[v]);
            System.out.println("The array element successfully accessed");
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException e)
        {
            System.out.println(String.valueOf(e.getClass()).substring(String.valueOf(e.getClass()).indexOf(' ')+1));
        }
    }
}
