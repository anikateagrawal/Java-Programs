package p4;

public class Person {
    String name;
    Person(String name)
    {
        this.name=name;
    }
}
class Student extends Person
{
    String CollegeName;

    public Student(String name, String collegeName) {
        super(name);
        CollegeName = collegeName;
    }
}
class Teacher extends Person
{
    int salary;
    String subject;

    public Teacher(String name,int salary, String subject) {
        super(name);
        this.salary = salary;
        this.subject = subject;
    }
    void display()
    {
        System.out.println(name+" "+salary+" "+subject);
    }
}
class CollegeStudent extends Student
{
    int year;String major;

    public CollegeStudent(String name, String collegeName, int year, String major) {
        super(name, collegeName);
        this.year = year;
        this.major = major;
    }
    void display()
    {
        System.out.println(name+" "+CollegeName+" "+year+" "+major);
    }
}
class Test2
{
    public static void main(String[] args) {
        CollegeStudent obj=new CollegeStudent("Anikate","GLA",1,"CS");
        Teacher ob=new Teacher("Neeraj",200000,"OOP");
        obj.display();ob.display();
    }
}
