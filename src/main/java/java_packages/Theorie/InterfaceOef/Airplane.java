package java_packages.Theorie.InterfaceOef;

public class Airplane extends Transport implements Refuelable, Washable {

    private String wingStatus;

    public Airplane(String name, String brand, String wingStatus) {
        super(name, brand);
        this.wingStatus = wingStatus;
    }

    @Override
    public boolean refuel(int amount) {
        System.out.println("Fuel left wing");
        System.out.println("Fuel right wing");
        return true;
    }

    @Override
    public void wash() {

    }

    public String getWingStatus() {
        return wingStatus;
    }

    public void setWingStatus(String wingStatus) {
        this.wingStatus = wingStatus;
    }

    @Override
    public void move() {

    }

    public void fly(){
        System.out.println("Zoef");
    }
}
