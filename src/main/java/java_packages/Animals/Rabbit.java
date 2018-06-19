package java_packages.Animals;

public class Rabbit extends Mammal {

    private boolean fluffy;

    public Rabbit(String name, boolean fluffy) {
        super(name);
        this.fluffy = fluffy;
    }

    public boolean isFluffy() {
        return fluffy;
    }


}
