package wrapper_class;

public class Equals {
    public static void main(String[] args) {
        byte b=10;
        Byte bb=10;
        int a=20;
        Integer aa=20;
        short s=30;
        Short ss=30;
        Long ll=40l;
        long l=40;
        float f=50.0f;
        Float ff=50.0f;
        double d=60.0;
        Double dd=60.0;
        boolean B=true;
        Boolean BB=true;
        char c='0';
        Character cc='0';
        System.out.println(aa.equals(a));
        System.out.println(bb.equals(b));
        System.out.println(cc.equals(c));
        System.out.println(dd.equals(d));
        System.out.println(ss.equals(s));
        System.out.println(ff.equals(f));
        System.out.println(BB.equals(B));
        System.out.println(ll.equals(l));
    }
}
