package collection_generics;
// Generic class Example

class GenericClass1<T>
{
    private T val1;
    // getter method
    public T getVal1() {
        return val1;
    }
    // Setter method
    public void setVal1(T val1) {
        this.val1 = val1;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        // you can create object with any declaration syntax
        GenericClass1<String> obj = new GenericClass1<String>();
        // GenericClass1<String> obj1 = new GenericClass1<>();
        // GenericClass1<String> obj2 = new GenericClass1();
        obj.setVal1("Neeraj");
        System.out.println(obj.getVal1());


    }
}