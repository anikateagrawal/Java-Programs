package p5;

import java.util.Scanner;

public class Student {
    String name,program;int age;

    public Student(String name, String program, int age) {
        this.name = name;
        this.program = program;
        this.age = age;
    }
    public void display_student_info()
    {
        System.out.println("Name = "+name+" Program = "+program+" Age= "+age);
    }
}
class Graduate_Student extends Student
{
    float percent_marks_in_12th;String stream;

    public Graduate_Student(String name, String program, int age, float percent_marks_in_12th, String stream) {
        super(name, program, age);
        this.percent_marks_in_12th = percent_marks_in_12th;
        this.stream = stream;
    }

    @Override
    public void display_student_info() {
        super.display_student_info();
        System.out.println(" % marks in 12th= "+percent_marks_in_12th+" stream= "+stream);
    }

    public void setPercent_marks_in_12th(float percent_marks_in_12th) {
        this.percent_marks_in_12th = percent_marks_in_12th;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
class Research_Student extends Student
{
    String specialization;int years_of_experience;

    public Research_Student(String name, String program, int age, String specialization, int years_of_experience) {
        super(name, program, age);
        this.specialization = specialization;
        this.years_of_experience = years_of_experience;
    }

    @Override
    public void display_student_info() {
        super.display_student_info();
        System.out.println("Specialization = "+specialization+" Years of experience = "+years_of_experience);
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setYears_of_experience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }
}
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, program, age, % marks in 12th and stream of graduate student ");
        Graduate_Student obj1=new Graduate_Student(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Float.parseFloat(sc.nextLine()),sc.nextLine());
        System.out.println("Enter name, program, age, % marks in 12th and stream of graduate student ");
        Graduate_Student obj2=new Graduate_Student(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Float.parseFloat(sc.nextLine()),sc.nextLine());
        System.out.println("Enter name, program, age, specialization and years of experience of research student ");
        Research_Student obj3=new Research_Student(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        System.out.println("Enter name, program, age, specialization and years of experience of research student ");
        Research_Student obj4=new Research_Student(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        obj1.display_student_info();
        obj2.display_student_info();
        obj3.display_student_info();
        obj4.display_student_info();
    }
}


