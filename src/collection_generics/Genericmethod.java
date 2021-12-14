package collection_generics;
// use of Generic Method

class DemoGeneric12<T>
{
    // function overloading concept shown here and going to replace this with generic method to reduce redundancy of code
//  public void display(Integer[] arr)
//  {
//    for (Integer res:arr) {
//      System.out.println(res);
//    }
//  }
//  public void display(Character[] arr)
//  {
//    for (Character res:arr) {
//      System.out.println(res);
//    }
//  }
    public void display(T [] arr)
    {
        for(T res :arr)
        {
            System.out.println(res);
        }
    }
}
public class Genericmethod {
    public static void main(String[] args) {
        Integer a1[]={10,20,30,40,50};
        Character a2[] = {'a','b','c','d','e'};
        DemoGeneric12 obj1 = new DemoGeneric12();
        obj1.display(a1);
        obj1.display(a2);
    }
}