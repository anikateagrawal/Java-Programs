package exception_handling;

import java.util.Scanner;

class InvalidCountryException extends Exception
{
    InvalidCountryException(String s)
    {
        super(s);
    }
}
public class UserRegistration {
    void registerUser(String username,String userCountry) throws InvalidCountryException {
        if(userCountry.equalsIgnoreCase("India")) System.out.println("User registration done successfully");
        else throw new InvalidCountryException("User Outside India cannot be registered");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user name");
        String username=sc.nextLine();
        System.out.println("Enter user Country");
        String userCountry=sc.nextLine();
        UserRegistration obj=new UserRegistration();
        try {
            obj.registerUser(username,userCountry);
        }
        catch (InvalidCountryException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
