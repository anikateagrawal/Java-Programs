package collection_generics;

/*
We use generic concept to provide type safety and to resolve
type casting problem
in this example using one class defined in collection framework(API)
with and without generics
 */

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // arrays are by-default type safe and there is no need of type casting
        // The problem with array is that its size is fixed.
        // we use collection framework classes to hold homogeneous and
        // heterogeneous data elements and also its size is not fixed
        // and we use generics with  classes defined in collection framework to
        // provide type safety and to resolve type casting problem
        // Example:-

        Integer arr[]= new Integer[10];
        arr[0]= 50;
        arr[1]= 60;
      //  arr[2] = "neeraj"; // it will generate compile time error incompatible type

        // Second Senerio
        // using ArrayList class of collection API without generics
        // Collection objects are not type safe if our requirement is to add only
        // Integer objects to the ArrayList, By mistake if we are trying to insert
        // any other element we will not  get any comple time error
        // as shown in the following lines
        ArrayList i = new ArrayList();
        i.add(10);     // remember it is autoboxing here
        i.add(15);
        i.add(20);
        i.add("anikate");

        // if we  retrieve values from ArrayList and assign to another variable
        // type casting is required
       // Integer val3 = i.get(2); // observe the error
        Integer val1 = (Integer) i.get(2);  // type casting required
        String val2 = String.valueOf(i.get(1));
        System.out.println(val1 + "   "+ val2);

        // Generic version of ArrayList

        ArrayList<String> s1 = new ArrayList<>();
        s1.add("neeraj");
        s1.add("kamal");
        // you can only hold String values  generic provide type safety
      //  s1.add(new Integer(67));
        //s1.add(68);

        // generic resolve type casting problem
        String a90 = s1.get(1);

        // to print all values stored in ArrayList we use forEach loop
        for (String res:s1)
        {
            System.out.println(res);
        }

    }
}