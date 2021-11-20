package multithreading;

public class Thread_Priorities {
    public static void main(String[] args) {
        Thread max=new Thread(()->{for(int i=1;i<=5;i++) System.out.println("MAX");});
        Thread min=new Thread(()->{for(int i=1;i<=5;i++) System.out.println("MIN");});
        Thread norm=new Thread(()->{for(int i=1;i<=5;i++) System.out.println("NORM");});
        max.setPriority(Thread.MAX_PRIORITY);min.setPriority(Thread.MIN_PRIORITY);norm.setPriority(Thread.NORM_PRIORITY);
        max.start();min.start();norm.start();
    }
}
