package multithreading;

public class Even_Odd {
    public static void main(String[] args) {
        Thread odd=new Thread(()->{for (int i=1;i<20;i+=2) System.out.println(i);});
        Thread even=new Thread(()->{
            try {
                odd.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i = 2; i<=20; i+=2) System.out.println(i);});
        odd.start();even.start();
    }
}
