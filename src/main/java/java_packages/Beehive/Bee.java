package java_packages.Beehive;

public abstract class Bee implements Insect { // abstract wilt zeggen dat er geen object van Bee kan aangemaakt worden, subklassen wel.

    protected String name;  //Beschikbaar binnen de package maar niet erbuiten.
    //private String name;

    public Bee(){
        this.name = "Default";
    }

    public Bee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println("Bee "+name+" is flying awaaaaaay");
    }

    public abstract void contribute(); // abstracte methode, heeft geen parameters want het is niet zeker wat deze methode moet doen.
                                        //Dit wordt gedefinïeerd in de subclass.
}
