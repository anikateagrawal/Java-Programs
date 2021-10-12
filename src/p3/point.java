package p3;

public class point {
    private int x,y;
    public point()
    {
        x=0;y=0;
    }
    public point(int x,int y)
    {
        this.x=x;this.y=y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public void setXY(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void display()
    {
        System.out.println(x+" , "+y);
    }
}
class Main1
{
    public static void main(String[] args) {
        point obj=new point(5,3);
        obj.display();
    }
}
