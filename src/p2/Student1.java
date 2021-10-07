package p2;

public class Student1 {
    String name,address;int age;
    Student1()
    {
        name ="unknown";
        age=0;
        address="not available";
    }
    public void setInfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
class Student1Main
{
    public static void main(String[] args) {
        Student1 obj[]=new Student1[10];
        for (int i=0;i<10;i++)
        {
            obj[i]=new Student1();
        }
        obj[2].setInfo("Ishika",19);
        obj[5].setInfo("Aditya",19,"Saharanpur");
        obj[7].setInfo("Anwesha",19);
        obj[1].setInfo("Monishka",19);
        obj[3].setInfo("Anikate",19,"Mathura");
        obj[0].setInfo("Divyanshi",18);
        obj[4].setInfo("Garima",18);
        obj[9].setInfo("Jagrati",18);
        for (int i=0;i<10;i++)
        {
            System.out.println(obj[i].name+"  "+obj[i].age+"  "+obj[i].address);
        }
    }
}