package java_packages.Theorie;

public class Interface {

    /*interface Carrier{
        void launchFighters();

    }
    interface Capitol {
        int shootCannon();
    }

    class Spaceship implements Capitol, Carrier{

        @Override
        public void launchFighters() {
            System.out.println("LAUNCH FIGHTERS");
        }

        @Override
        public int shootCannon() {
            return 15;
        }
    }*/
    interface Carrier{
        default void launchFighters() {
            System.out.println("LAUNCH FIGHTERS");
        }

        default void fly(){
            System.out.println("Fly, but slowly");
        }
    }
    interface Capitol {
        default int shootCannon() {
            return 15;
        }
        default void fly(){
            System.out.println("Fly");
        }
    }

    class Spaceship implements Capitol, Carrier{
        @Override
        public void fly() {
            Carrier.super.fly();
            Capitol.super.fly();
        }
    }


}
