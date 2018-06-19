package java_packages.Beehive;

public class MainHive {
    public static void main(String[] args) {

        Flower daisy = new Flower(10,"white", "daisy");
        Flower violet = new Flower (7,"violet","Violet");

        Worker maja = new Worker("maja",100,10);
        Worker willy = new Worker("willy",130,5);
        // Worker jos = new Worker(15);
        Worker magda = new Worker(); // default constructor

        maja.gatherNectar(violet);

        Soldier arnold = new Soldier();
        Soldier sylvester = new Soldier();



if(sylvester.hitpoints>0) {
    while (sylvester.isDead() == false) {

        arnold.attack(sylvester);
    }
    System.out.println("He dead");
}

            sylvester.defend(arnold);
        }

    }

