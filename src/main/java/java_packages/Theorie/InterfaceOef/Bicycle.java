package java_packages.Theorie.InterfaceOef;

public class Bicycle extends Transport implements Washable {


    @Override
    public void wash() {

    }

    @Override
    public void move() {

    }

    public Bicycle(String name, String brand) {
        super(name, brand);
    }
}
