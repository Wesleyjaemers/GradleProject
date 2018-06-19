package java_packages.Beehive;

public class Drone extends Bee {
    String type;
    int charisma, semencount, hitpoints;

    public Drone (String name, int c, int s, int h, String t){
        super(name);
        //super(); roept de default constructor van Bee aan
        this.charisma = c;
        this.semencount = s;
        this.hitpoints = h;
        this.type = t;
    }
    public boolean isDead() {
        return this.hitpoints <= 0;
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
