package wrapper_class;

public class Test4 {
    static void function(int i)
    {
        System.out.println("int");
    }
    static void function(Integer i)
    {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        byte b=10;
        function(b);
    }
}
