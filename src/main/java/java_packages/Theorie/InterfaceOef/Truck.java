package java_packages.Theorie.InterfaceOef;

public class Truck extends Transport implements Refuelable, Washable {

    private int capacity;

    @Override
    public boolean refuel(int amount) {
        return true;
    }

    @Override
    public void wash() {

    }

    public Truck(String name, String brand, int capacity) {
        super(name, brand);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void move() {

    }
}
