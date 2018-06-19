package java_packages.Beehive;

public class Worker extends Bee {
    private int capacity = 10;       //class variable
    private int load = 0;

    /* public void gatherNectar(){     //geen static omdat het een instantie is van de objecten.
        for (int i = 0; i < 10 && capacity > load;i++){     //De methode is dus niet globaal beschikbaar (zoals bv. System, Math, ..)
            System.out.println("ga naar volgende bloem "+capacity+" "+load);
            // visit flower
            load +=5;
        }
    } */

    public boolean gatherNectar(Flower f){
        System.out.println("bla bla");
                load += f.nectar;
        f.nectar=0;
        return load >= capacity ;
    }

    public Worker(){        //default constructor
        load = 5;
        capacity = 100;
    }

    @Override
    public void contribute() {

    }

    public Worker (String name, int initialCapacity, int initialLoad){
        super(name); //Constructor van de superklasse aanspreken "Bee" voor de naam in te geven
        this.capacity = initialCapacity;
        this.load = initialLoad;
    }

    @Override
    public void eat() {

    }

    @Override
    public void crawl() {

    }

    @Override
    public void pee() {

    }

   /* public Worker(int load){  //constructor met 1 parameter
        this.load=load;
        capacity = 100;
    }

    public Worker (int cap){
        this("Erik", cap, 10);   // Constructor die een andere constructor aanspreekt voor de bijkomende parameters
    }*/

}
