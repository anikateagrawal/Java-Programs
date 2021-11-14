package exception_handling;
class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}

public class Age {
    public static void main(String[] args) {
        try
        {
            Integer age=Integer.valueOf(args[1]);
            if(age<18||age>=60)throw new InvalidAgeException("Age is not >=18 and <60");
        }
        catch (InvalidAgeException|ArrayIndexOutOfBoundsException|NumberFormatException e)
        {
            System.out.println(e.toString());
        }
    }
}
