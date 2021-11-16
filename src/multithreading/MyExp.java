package multithreading;
import java.util.Scanner;

public class MyExp {
    public static void main(String[] args) {
    Thread obj=Thread.currentThread();
        System.out.println(obj.getName());
        obj.setName("Anikate");
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        System.out.println(obj.isAlive());
        System.out.println(obj.getPriority());
        System.out.println(obj.isDaemon());
        obj.setPriority(1);
        System.out.println(obj.getPriority());
    }
}
