package p2;

import java.util.Scanner;

public class Car {
    String manufacturer;
    int price;
    Car()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter car manufacturer and price");
        manufacturer=s.nextLine();
        price=s.nextInt();
    }
    void display()
    {
        System.out.println("Car manufacturer is "+manufacturer+" and price is "+price);
    }
}
class CarMain
{
    public static void main(String[] args) {
        Car[] arr=new Car[3];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new Car();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j+1].price<arr[j].price)
                {
                    Car temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(var i:arr)
        {
            i.display();
        }
    }
}
