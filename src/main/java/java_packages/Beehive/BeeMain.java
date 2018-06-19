package java_packages.Beehive;

public class BeeMain {
    public static void main(String[] args) {

         //Bee Maja = new Bee ("Maja"); // een algemene bij maken heeft geen nut dus is de class abstract
        Bee Erik = new Drone("Erik",3,600,100,"nieuw");
        Bee Ludo = new Soldier();

        //Bee a = Ludo;   // dit is altijd correct. een soldier is altijd een bee
        //Worker w = Ludo;     // dit gaat niet. een soldier is geen worker
        //Soldier s = Maja; //dit gaat ook niet altijd want niet elke bee is een soldier.
        //Soldier s = (Soldier)Maja;  //Hier kan een downcast op gebruikt worden om dit mogelijk te maken.
        //                              Hiervoor moet het object wel als een soldier zijn aangemaakt
        //                              en dan upcast naar Bee. Alleen dan is een downcast mogelijk



        Worker w = new Worker("Willy", 0, 100);
        Drone d1 = new Drone("Buh",6,1000,100,"Machien");
        Queen q1 = new Queen("test",40, 20,"Testie",100);
        Soldier s1 = new Soldier();

        //Print p = new Print ();
        //p.introPrint();

        System.out.println(w.getName());

        d1.setName("Niet Ludo");
        System.out.println(d1.getName());
        System.out.println(q1.getName());
        Erik.fly();
        Ludo.fly();





    }
}
