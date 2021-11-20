package multithreading;

import java.util.Random;

public class Colours {
    public static void main(String[] args) {
        String[] colours={"white","blue","black","green","red","yellow"};
        Thread obj=new Thread(()->
        {int i=new Random().nextInt(6);
            while(!colours[i].equals("red")) {
                System.out.println(colours[i]);
                i = new Random().nextInt(6);
            }
        });
        obj.start();
    }
}
