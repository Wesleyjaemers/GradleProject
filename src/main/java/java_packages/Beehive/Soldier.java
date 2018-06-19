package java_packages.Beehive;

public class Soldier extends Bee {

    int hitpoints =100, armour=2, strength=10;
    String weapon = "angel";

    public void defend(Soldier enemy){
        if (enemy.isDead()==false){
            this.hitpoints -= ((enemy.strength*0.5)-this.armour);
            enemy.hitpoints -= ((this.strength*0.2)-enemy.armour);
            System.out.println("defended with "+weapon+". "+this.hitpoints+" hitpoints left");
        }
    }

    public void attack(Soldier enemy){
        if(enemy.isDead()==false){
            enemy.hitpoints-=((this.strength*1.5)-enemy.armour);
            this.hitpoints -= ((enemy.strength* 0.5) -this.armour);
            System.out.println("attacked with "+weapon+" for "+ strength+" dmg. "+enemy.hitpoints+" hitpoints left on the enemy");
        }
    }

    public boolean isDead(){

        return hitpoints <=0;
    }

    public void contribute(){   //Hier definieren we wat de class effectief doet
        System.out.println("Soldier contibutes to the fight");
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
