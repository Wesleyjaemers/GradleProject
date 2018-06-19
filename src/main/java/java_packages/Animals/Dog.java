package java_packages.Animals;

import java_packages.Theorie.Random;

public class Dog extends Mammal {

    private String color;

    String [] trickList = {"sits", "lays down", "rolls", "fetches ball"};


    public Dog (String name, String color){
        super(name);
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println(this.name+ " says Woef");
    }

    public void bite(){
        System.out.println("Hang");
    }

    public void doTrick (){
        System.out.println("Doggo trickmeister  "+trickList[Random.berekenRandomGetal(0,3)]);
    }


}
