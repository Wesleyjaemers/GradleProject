package java_packages.Beehive;

public class Queen extends Bee {
    String type;
    private int eggs, mood, danceRes, strength, countWin, countLoss, energy;

    public Queen (String name, int m, int s, String t, int energy){
        super(name); // roept de 1e constructor aan van Bee
        this.mood = m;
        this.strength = s;
        this.type = t;
        this.energy = energy;
    }

    public void danceOff(Drone d){
        while(eggs==0 && !d.isDead()) {
            if (mood >= 100) {
                eggs = d.semencount - ((int) (Math.random() * 100));
                System.out.println("\n \t Result \n"+
                                    "<----------------> \n " +
                                    d.getName()+" has made the Queen very happy after "+countWin+" times. \n" +
                                    " Queen "+this.getName()+" layed "+eggs+" eggs");
            } else {
                danceRes = d.charisma + ((int) (Math.random() * 10));
                if (danceRes >= 10) {
                    this.mood += 10;
                    if(mood > 100){
                        this.mood = 100;
                    }
                    System.out.println("Dance succesfull, current mood: " + this.mood+"%");
                    countWin++;
                } else {
                    d.hitpoints -= this.strength;
                    if (d.hitpoints<0){
                        d.hitpoints=0;
                    }
                    System.out.println("Denied. Not impressed, got smacked. " + d.getName() + " has " + d.hitpoints + "left");
                    countLoss++;
                }
            }
            if (d.isDead()) {

                System.out.println("\n \t Result \n"+
                                    "<----------------> \n " +
                                    "He dead. Tried "+countLoss+" times");
            }
        }
    }

    public void layLarva (){
        System.out.println("queen lays larva, has "+energy+" left");
        energy -=10;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public void contribute() {

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

}

class QueenIsTired extends RuntimeException{
    public QueenIsTired() {
    }

    public QueenIsTired(String message) {
        super(message);
    }
}
