package p3;

public class Outer {
    Inner obj=new Inner();
    void display()
    {
        System.out.println("Outer");
    }
    class Inner
    {
        void display()
        {
            System.out.println("Inner");
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.display();
        obj.obj.display();
    }
}
