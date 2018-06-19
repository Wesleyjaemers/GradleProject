package java_packages.Theorie.InterfaceOef;

public class Snowmobile extends Transport implements Refuelable, Washable {


    public Snowmobile(String name, String brand) {
        super(name, brand);
    }

    @Override
    public boolean refuel(int amount) {
        return true;
    }

    @Override
    public void move() {

    }

    @Override
    public void wash() {

    }
}
