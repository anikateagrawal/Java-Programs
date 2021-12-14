package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// representation of comparator interface for customize sorting 

public class Emp20
{
    public String name;
    public int  id;
    Emp20(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return name  +
                " "+id;
    }
}

// two representations given here

// here sort  the data by using the name 

class Sortbyname implements Comparator<Emp20>
{
    @Override
    public int compare(Emp20 o1, Emp20 o2) {
        return o1.name.compareTo(o2.name);
    }
}

// here sort the data by using the  id 

class Sortbyid implements Comparator<Emp20>
{
    @Override
    public int compare(Emp20 o1, Emp20 o2) {
        if(o1.id> o2.id)
        {
            return 1;
        }
        if (o1.id< o2.id)
        {
            return -1;
        }
        return 0;
    }
}
class ComExample1 {
    public static void main(String[] args) {
        ArrayList<Emp20> obj=  new ArrayList<>();
        obj.add(new Emp20("Aman", 102));
        obj.add(new Emp20("Rahul", 106));
        obj.add(new Emp20("Saurabh", 104));
        obj.add(new Emp20("Kamal", 103));
        // Collections.sort(obj,new Sortbyid());

        // used Collections class sort method to sort and passing two parameters one is for
        // collection object and other is for another class object that implements Compaator interface

        Collections.sort(obj,new Sortbyname());
        System.out.println(obj);

    }
}