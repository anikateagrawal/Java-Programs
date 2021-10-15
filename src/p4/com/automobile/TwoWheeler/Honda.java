package p4.com.automobile.TwoWheeler;
import p4.com.automobile.Vehicle;
public class Honda extends Vehicle{
    String model,RegistrationNo,OwnerName;
    int speed;

    public Honda(String model, String registrationNo, String ownerName, int speed) {
        this.model = model;
        RegistrationNo = registrationNo;
        OwnerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return model;
    }

    @Override
    public String getRegistrationNumber() {
        return RegistrationNo;
    }

    @Override
    public String getOwnerName() {
        return OwnerName;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void cdplayer()
    {
        System.out.println("cd player");
    }
}
