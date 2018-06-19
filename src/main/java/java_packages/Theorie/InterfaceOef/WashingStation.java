package java_packages.Theorie.InterfaceOef;

public class WashingStation {

    public void service (Washable w){
        System.out.println("Get some water");
        System.out.println("Get some soap");
        w.wash();
    }

}
