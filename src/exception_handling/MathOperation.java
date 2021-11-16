package exception_handling;
public class MathOperation {
    public static void main(String[] args) {
        int[] ar =new int[args.length];
        try
        {
            int sum=0;
            for(int i=0;i< args.length;i++){
                ar[i]=Integer.parseInt(args[i]);
                sum=sum+ar[i];
            }
            float avg = (float)(sum / ar.length);
            System.out.println("Sum ="+sum+"\nAverage="+avg);
        }
        catch (ArithmeticException|NumberFormatException e)
        {
            System.out.println(e.getClass().getName());
        }
    }
}
