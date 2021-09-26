package p1;
public class Test {

    int num1,num2;
    Test()
    {
        num1=50_000;num2=1_45_000;
        System.out.println("constructor");
    }
    public void display()
    {
        System.out.println(num1);
        System.out.println(num2);
    }

}
class finaltest extends Test{
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
        Test obj2 = obj;
        obj.num1=100;
        obj2.display();

    }
}