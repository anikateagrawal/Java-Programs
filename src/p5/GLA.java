package p5;

import java.util.Scanner;

public class GLA {
    float original_fees, deposit, school_levy, sports_fees;

    public GLA(float original_fees, float deposit) {
        this.original_fees = original_fees;
        this.deposit = deposit;
        school_levy = original_fees * 10 / 100;
        sports_fees = original_fees * 5 / 100;
    }

    public void calculate_Total_fees() {
        if (deposit > original_fees / 2) {
            original_fees = original_fees * 95 / 100;
        }
        System.out.println("Total fees to be paid = " + (original_fees - deposit + school_levy + sports_fees));
    }

}
class Fees{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter original fees value greater than 50000 and deposit value greater than 10000");
        GLA obj=new GLA(sc.nextFloat(),sc.nextFloat());
        obj.calculate_Total_fees();
    }
}
