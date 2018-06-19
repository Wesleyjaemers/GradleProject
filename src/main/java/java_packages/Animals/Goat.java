package java_packages.Animals;

public class Goat extends Mammal {

    private boolean milk;
    private String color;


    public Goat(String name, boolean milk, String color) {
        super(name);
        this.milk = milk;
        this.color=color;
    }

    @Override
    public void sound() {
        System.out.println(this.name+" says meeeeh");
    }
}
