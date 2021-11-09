package wrapper_class;

public class Test2 {
    static Integer i;

    public static void main(String[] args) {
        int m=i;
        System.out.println(m);//null pointer exception
    }
}
