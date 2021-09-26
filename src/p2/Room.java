package p2;

import java.util.Scanner;

public class Room {
    boolean ac_on,home_theatre_on,fan_on,light_on;
    void totalPower()
    {
        int power=0;
        if(ac_on)power=power+1200;
        if(home_theatre_on)power=power+600;
        if(fan_on)power=power+400;
        if(light_on)power=power+100;
        if(power>2000) System.out.println("overload");
    }
}
class RoomMain
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Room obj=new Room();
        while(true)
        {
            System.out.println("Enter your choice \n1 to set ac on\n2 to set ac off\n3 to set home theatre on\n4 to set home theatre off\n5 to set fan on\n6 to set fan off\n7 to set light on\n8 to set light off\n-1 to exit");
            int ch=s.nextInt();
            switch (ch) {
                case 1 -> {
                    obj.ac_on = true;
                    System.out.println("AC on");
                }
                case 2 -> {
                    obj.ac_on = false;
                    System.out.println("AC off");
                }
                case 3 -> {
                    obj.home_theatre_on = true;
                    System.out.println("Home theatre on");
                }
                case 4 -> {
                    obj.home_theatre_on = false;
                    System.out.println("Home theatre off");
                }
                case 5 -> {
                    obj.fan_on = true;
                    System.out.println("Fan on");
                }
                case 6 -> {
                    obj.fan_on = false;
                    System.out.println("Fan off");
                }
                case 7 -> {
                    obj.light_on = true;
                    System.out.println("Light on");
                }
                case 8 -> {
                    obj.light_on = false;
                    System.out.println("Light off");
                }
                case -1 -> {
                    System.out.println("You have left the Room");
                    System.exit(0);
                }
                default -> System.out.println("Wrong choice");
            }obj.totalPower();
        }
    }
}
