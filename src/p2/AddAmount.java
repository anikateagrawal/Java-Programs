package p2;

public class AddAmount {
    static int amount;
    static {
        amount=50;
    }
    AddAmount()
    {
    }
    AddAmount(int a)
    {
        amount=amount+a;
    }
}
class AddAmountMain
{
    public static void main(String[] args) {
        AddAmount obj=new AddAmount(50);
        AddAmount obj2=new AddAmount();
        System.out.println(AddAmount.amount);
    }
}
