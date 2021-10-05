package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {
    public static void main(String[] args) {
        Veena obj=new Veena();
        obj.play();
        Saxophone obj2=new Saxophone();
        obj2.play();
        Playable ob1[]=new Playable[2];
        ob1[0]=obj;ob1[1]=obj2;
        for (var i:ob1)
        {
            i.play();
        }
    }
}
