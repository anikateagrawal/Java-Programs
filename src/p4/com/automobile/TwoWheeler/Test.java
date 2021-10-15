package p4.com.automobile.TwoWheeler;

public class Test {
    public static void main(String[] args) {
        Hero obj=new Hero("Maestro","UP85XX9999","Anikate",40);
        Honda ob=new Honda("Activa 6G","UP85XX9998","Anikate",50);
        System.out.println(obj.getModelName()+" "+obj.getRegistrationNumber()+" "+obj.getOwnerName()+" "+obj.getSpeed());
        obj.radio();
        System.out.println(ob.getModelName()+" "+ob.getRegistrationNumber()+" "+ob.getOwnerName()+" "+ob.getSpeed());
        ob.cdplayer();
    }
}
