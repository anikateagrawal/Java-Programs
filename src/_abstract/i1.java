package _abstract;
@FunctionalInterface
public interface i1 {
    void m1();
}
class test2
{
    public static void main(String[] args) {
        i1 obj = (i1) () -> System.out.println("hello");
        obj.m1();
    }
}
