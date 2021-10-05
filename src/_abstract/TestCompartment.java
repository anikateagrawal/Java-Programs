package _abstract;

import java.util.Scanner;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment arr[]=new Compartment[10];
        Scanner s=new Scanner(System.in);
        for(var i=0;i<10;i++)
        {
            System.out.println("Enter a number from 1 to 4");
            int c=s.nextInt();
            switch (c)
            {
                case 1->arr[i]=new FirstClass();
                case 2->arr[i]=new Ladies();
                case 3->arr[i]=new General();
                case 4->arr[i]=new Luggage();
                default -> {System.out.println("Wrong choice try again");i=i-1;}
            }
        }
        for (var i:arr)
        {
            System.out.println(i.notice());
        }
    }
}
