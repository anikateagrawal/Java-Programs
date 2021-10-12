package p3;

public class Box {
    int length,breadth,height;
    Box(int l,int b,int h)
    {
        length=l;breadth=b;height=h;
    }
}
class Box3d extends Box
{
    Box3d(int l,int b,int h)
    {
        super(l,b,h);
    }
    void area()
    {
        System.out.println(2*(length*breadth+length*height+height*breadth));
    }
    void volume()
    {
        System.out.println(length*breadth*height);
    }
}
class Main2
{
    public static void main(String[] args) {
        Box3d obj=new Box3d(2,3,4);
        obj.area();obj.volume();
    }
}
