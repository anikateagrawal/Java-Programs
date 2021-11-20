package multithreading;

public class Scooby {
    public static void main(String[] args) {
        Thread obj=new Thread(()->System.out.println("Scooby"));
        Thread obj2=new Thread(()-> System.out.println("Shaggy"));
        obj.start();obj2.start();
        obj.setName("Scooby");obj2.setName("Shaggy");
        System.out.println(obj.getName());
        System.out.println(obj2.getName());
    }
}
