package java_packages.Theorie.InterfaceOef;

public class Cabrio extends Car {

    @Override
    public boolean refuel(int amount) {
        return super.refuel(amount);
    }

    @Override
    public void move() {
        super.move();
    }

    public Cabrio(String name, String brand) {
        super(name, brand);
    }
}
