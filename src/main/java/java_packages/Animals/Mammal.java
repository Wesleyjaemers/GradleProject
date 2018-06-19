package java_packages.Animals;

public abstract class Mammal implements Animal {

    protected String name;


    public Mammal(){

    }

    public Mammal(String name) {
        this.name = name;
    }

    public void sound() // het uitvoeren van de methode gaat bepaald worden door de subclass
    {
        System.out.println(this.name+" says Miep");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("NOM NOM NOM");
    }
}
