package p4;

import java.util.Scanner;

public abstract class Instrument {
    abstract void play();
}
class Piano extends Instrument
{
    void play()
    {
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Flute extends Instrument
{
    void play()
    {
        System.out.println("FLute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument
{
    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}
class Main
{
    public static void main(String[] args) {
        Instrument arr[]=new Instrument[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter 1 for piano 2 for flute 3 for guitar");
            Scanner s=new Scanner(System.in);
            int c=s.nextInt();
            switch(c)
            {
                case 1->arr[i]=new Piano();
                case 2->arr[i]=new Flute();
                case 3->arr[i]=new Guitar();
                default -> {
                    System.out.println("Wrong choice try again");
                    i--;
                }
                }
            }
        for (int i=0;i<10;i++)
        {
            if(arr[i] instanceof Piano)
            {
                System.out.println("Piano stored at index "+i);
                arr[i].play();
            }
            else if(arr[i] instanceof Flute)
            {
                System.out.println("FLute stored at index "+i);arr[i].play();
            }
            else if(arr[i] instanceof Guitar)
            {
                System.out.println("Guitar stored at index "+i);arr[i].play();
            }
        }
    }
}

