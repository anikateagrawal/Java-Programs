package interest_calculator;

import java.util.Scanner;

public abstract class Account {
    double interestRate,amount;
    public abstract double calculateInterest();
}
class FDAccount extends Account
{
    int noOfDays,ageOfACHolder;
    public double calculateInterest()
    {
        if(noOfDays>184)interestRate=10;
        else if (noOfDays>60)interestRate=9.5;
        else if(noOfDays>44)interestRate=9;
        else if (noOfDays>29)interestRate=7.5;
        else if (noOfDays>14)interestRate=6.75;
        else if (noOfDays>6)interestRate=6.5;
        if (amount<10000000){
            interestRate=interestRate-2;
            if(ageOfACHolder>=60)interestRate=interestRate+0.5;
        }
        return interestRate*amount/100*noOfDays/365;
    }
}
class RDAccount extends Account
{
    int noOfMonths;double monthlyAmount;int ageOfACHolder;
    public double calculateInterest()
    {
        if(noOfMonths>20)interestRate=8.75;
        else if(noOfMonths>17)interestRate=8.5;
        else if(noOfMonths>14)interestRate=8.25;
        else if(noOfMonths>11)interestRate=8;
        else if(noOfMonths>8)interestRate=7.75;
        else if(noOfMonths>5)interestRate=7.5;
        if (ageOfACHolder>59)interestRate=interestRate+0.5;
        return monthlyAmount*noOfMonths*(noOfMonths+1)/24*interestRate/100;
    }
}
class SBAccount extends Account
{
    int typeOfAC;

    @Override
    public double calculateInterest() {
        if (typeOfAC==1)interestRate=4;else interestRate=6;
        return interestRate*amount/100;
    }
}
class Exception extends java.lang.Exception
{
    public Exception(String s)
    {
        super(s);
    }
}
class InterestCalculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            int ch;
            System.out.println("Select the option:\n\t1. Interest Calculator-SB\n\t2. Interest Calculator-FD\n\t3. Interest Calculator-RD\n\t4. Exit");
            ch=sc.nextInt();
            try {
                switch (ch) {
                    case 1 -> {
                        SBAccount obj = new SBAccount();
                        System.out.println("Enter the Average amount in your account:");
                        obj.amount = sc.nextDouble();
                        System.out.println("Enter type of account: \n1. Normal Account\n2. NRI Account");
                        int type = sc.nextInt();
                        switch (type) {
                            case 1 -> obj.typeOfAC = 1;
                            case 2 -> obj.typeOfAC = 2;
                            default -> throw new Exception("Invalid type of Account.Please enter correct values");
                        }
                        if(obj.amount<0)throw new Exception("Invalid Amount.Please enter correct values");
                        System.out.println("Interest gained: Rs." + (int) obj.calculateInterest());
                    }
                    case 2 -> {
                        FDAccount obj = new FDAccount();
                        System.out.println("Enter the FD amount:");
                        obj.amount= sc.nextDouble();
                        System.out.println("Enter the number of days");
                        obj.noOfDays=sc.nextInt();
                        System.out.println("Enter your age");
                        obj.ageOfACHolder=sc.nextInt();
                        if (obj.amount<0)throw new Exception("Invalid amount.Please enter correct values");
                        if (obj.noOfDays<0)throw new Exception("Invalid Number of Days.Please enter correct values");
                        if(obj.ageOfACHolder<0)throw new Exception("Invalid age.Please enter correct values");
                        System.out.println("Interest gained is:Rs."+(int)obj.calculateInterest());
                    }
                    case 3->{
                        RDAccount obj=new RDAccount();
                        System.out.println("Enter Monthly Deposit Amount");
                        obj.monthlyAmount=sc.nextDouble();
                        System.out.println("Enter number of months");
                        obj.noOfMonths=sc.nextInt();
                        System.out.println("Enter your age");
                        obj.ageOfACHolder=sc.nextInt();
                        if(obj.noOfMonths<0)throw new Exception("Invalid number of months.Please enter correct values");
                        if(obj.amount<0)throw new Exception("Invalid amount.Please enter correct values");
                        if(obj.ageOfACHolder<1)throw new Exception("Invalid age.Please enter correct values");
                        System.out.println("Interest gained is:Rs."+(int)obj.calculateInterest());
                    }
                    case 4->System.exit(0);
                    default ->throw new Exception("Invalid choice.Please enter correct values");

                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}