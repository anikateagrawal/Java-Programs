package p2;

public class Programming {
    Programming()
    {
        System.out.println("I love programming languages");
    }
    Programming(String s)
    {
        System.out.println("I love "+s);
    }
}
class ProgrammingMain
{
    public static void main(String[] args) {
        Programming obj=new Programming();
        Programming obj2=new Programming("Java");
    }
}

