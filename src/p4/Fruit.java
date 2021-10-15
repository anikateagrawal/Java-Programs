package p4;

public class Fruit {
    String name,taste,size;
    void eat(String name,String taste)
    {
        this.name=name;this.taste=taste;
    }
}
class Apple extends Fruit
{
    void eat(String name,String taste)
    {
        this.name=name;this.taste=taste;
    }
    void display()
    {
        System.out.println(name+" "+taste);
    }
}
class Orange extends Fruit
{
    void eat(String name,String taste)
    {
        this.name=name;this.taste=taste;
    }
    void display()
    {
        System.out.println(name+" "+taste);
    }
}
class Test3
{
    public static void main(String[] args) {
        Apple obj=new Apple();
        obj.eat("Apple","Sweet");
        Orange obj2=new Orange();
        obj2.eat("Orange","Sour");
        obj.display();obj2.display();
    }
}
