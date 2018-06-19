package java_packages.Theorie.InterfaceOef;

public class Generator implements Refuelable {

    private int power;

    @Override
    public boolean refuel(int amount) {
        return true;
    }

    public void generateElectricity(){

    }

    public Generator(int power) {
        this.power = power;
    }
}
