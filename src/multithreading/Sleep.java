package multithreading;

public class Sleep {
    public static void main(String[] args) {
        Thread obj=new Thread(()-> {
            for (int i = 1; i <= 10; i++) {
                if (i == 6) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(i);
            }
        });
        obj.start();
    }
}
