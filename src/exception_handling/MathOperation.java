package exception_handling;
public class MathOperation {
    public static void main(String[] args) {
        Integer[] ar =new Integer[args.length];
        try
        {
            int sum=0;
            for(int i=0;i< args.length;i++){
                ar[i]=Integer.valueOf(args[i]);
                sum=sum+ar[i];
            }
            float avg = (float)(sum / ar.length);
            System.out.println("Sum ="+sum+"\nAverage="+avg);
        }
        catch (ArithmeticException|NumberFormatException e)
        {
            System.out.println(String.valueOf(e.getClass()).substring(String.valueOf(e.getClass()).indexOf(' ')+1));
        }
    }
}
