package p2;

import java.util.Scanner;

public class Array {
    public boolean search(int arr[],int search_element)
    {
        for (int j : arr) {
            if (j == search_element) return true;
        }
        System.out.println("element not found");
        return false;
    }
}
class ArrayMain
{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to search");
        int n=s.nextInt();
        Array obj=new Array();
        System.out.println(obj.search(arr,n));
    }
}
