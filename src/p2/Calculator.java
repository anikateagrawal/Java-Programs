package p2;

public class Calculator {
    public static int powerInt(int num1,int num2)
    {
        return (int)Math.pow(num1,num2);
    }
    public static Double powerDouble(Double num1,int num2)
    {
        return Math.pow(num1,num2);
    }
}
class CalculatorMain
{
    public static void main(String[] args) {
        System.out.println(Calculator.powerInt(5,6));
        System.out.println(Calculator.powerDouble(5.6,4));
    }
}
