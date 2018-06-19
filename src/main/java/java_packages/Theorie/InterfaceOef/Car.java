package java_packages.Theorie.InterfaceOef;

public class Car extends Transport implements Refuelable, Washable {

    @Override
    public void wash() {

    }

    @Override
    public void move() {

    }

    public Car(String name, String brand) {
        super(name, brand);
    }

    @Override
    public boolean refuel(int amount) {
        System.out.println("Tank full");
        return true;
    }
}
