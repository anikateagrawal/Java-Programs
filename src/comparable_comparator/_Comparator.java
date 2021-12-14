package comparable_comparator;

import java.util.*;

public class _Comparator {
    public static void main(String[] args) {
        TreeSet<Integer> obj=new TreeSet<>(new MySort());
        obj.add(10);
        obj.add(40);
        obj.add(10);
        obj.add(50);
        System.out.println(obj);
    }
}
class MySort implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1,Integer o2) {
        return o2.compareTo(o1);
    }
}