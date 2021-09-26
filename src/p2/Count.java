package p2;

public class Count {
    static int count;
    {
        count++;
    }
}
class CountMain
{
    public static void main(String[] args) {
        for(int i = 0; i<5; i++)
            new Count();
        System.out.println("No of instances created so far = "+Count.count );
    }
}
