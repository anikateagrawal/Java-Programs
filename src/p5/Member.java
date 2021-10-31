package p5;

import java.util.Scanner;

public class Member {
    String name,address;
    int age;long phone_number;
    float salary;

    public Member(String name, String address, int age, long phone_number, float salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone_number = phone_number;
        this.salary = salary;
    }
    public void display()
    {
        System.out.println("Name= "+name+" Address= "+address+" Age= "+age+" Phone number= "+phone_number+" Salary=Rs."+salary);
    }
    public void printSalary() {
        System.out.println(salary);
    }
}
class Employee extends Member
{
    String specialization;

    public Employee(String name, String address, int age, long phone_number, float salary, String specialization) {
        super(name, address, age, phone_number, salary);
        this.specialization = specialization;
    }
    public void display()
    {
        super.display();
        System.out.println("Specialization= "+specialization);
    }
}
class Manager extends Member
{
    String department;

    public Manager(String name, String address, int age, long phone_number, float salary, String department) {
        super(name, address, age, phone_number, salary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department= "+department);
    }
}
class Create_Member
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, address, age ,phone number, salary and specialization of employee");
        Employee obj=new Employee(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Long.parseLong(sc.nextLine()),Float.parseFloat(sc.nextLine()),sc.nextLine());
        System.out.println("Enter name, address, age ,phone number, salary and department of manager");
        Manager obj2=new Manager(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Long.parseLong(sc.nextLine()),Float.parseFloat(sc.nextLine()),sc.nextLine());
        obj.display();obj2.display();
    }
}
