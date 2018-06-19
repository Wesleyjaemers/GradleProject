package java_packages.Theorie.InterfaceOef;

public class AppMain {

    public static void main(String[] args) {

        GasStation station = new GasStation();

        Car c = new Car("Astra", "Opel");
        Airplane a = new Airplane("Boeing", "747","2 wings");

        station.service(c);
        station.service(a);

        WashingStation w = new WashingStation();

        Bicycle b = new Bicycle("Tandem","Handibike");

        w.service(c);
        w.service(b);

        Transport t = new Bicycle("Tandem","Handibike");

        if (t instanceof Airplane){
            System.out.println("tis een vliegtuig!");
        }else System.out.println("niks");

        Donkey d = new Donkey("Ludo", "awesome");
        d.move();
    }




}
