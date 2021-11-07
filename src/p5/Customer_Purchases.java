package p5;

import java.util.Scanner;

public class Customer_Purchases {
    private long customer_number;
    private String first_name,surname,product;
    private int price,quantity;

    public long getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(long customer_number) {
        this.customer_number = customer_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
class Printing
{
    Customer_Purchases obj=new Customer_Purchases();
    void printDetails()
    {
        System.out.println(obj.getFirst_name()+" "+obj.getSurname());
        System.out.println(obj.getCustomer_number());
        System.out.println(obj.getProduct()+" Rs."+obj.getPrice()+" "+obj.getQuantity()+" piece");
        customerPurchaseReport();
    }
    void customerPurchaseReport()
    {
        float total=obj.getQuantity()*obj.getPrice();
        float tax=(15*total/100);
        float commission=8.5f*total/100;
        float discount=10*total/100;
        total=total+tax-(discount+commission);
        System.out.println(" Tax =15% = Rs."+tax);
        System.out.println("Commission =8.5%=Rs."+commission);
        System.out.println("Discount=10%=Rs."+discount);
        System.out.println("Total =Rs."+total);
    }
}
class Purchase
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Printing ob=new Printing();
        System.out.println("Enter first name, surname ,number,product,price,quantity");
        ob.obj.setFirst_name(sc.next());
        ob.obj.setSurname(sc.next());
        ob.obj.setCustomer_number(sc.nextLong());
        ob.obj.setProduct(sc.next());
        ob.obj.setPrice(sc.nextInt());
        ob.obj.setQuantity(sc.nextInt());
        ob.printDetails();
    }
}