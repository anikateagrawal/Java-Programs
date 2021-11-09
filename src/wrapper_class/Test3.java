package wrapper_class;

public class Test3 {
    public static void main(String[] args) {
        Integer X=10;
        Integer Y=X;
        X++;
        System.out.println(X);//11
        System.out.println(Y);//10
        System.out.println(X==Y);//false
    }
}
