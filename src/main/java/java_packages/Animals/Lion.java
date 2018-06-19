package java_packages.Animals;

public class Lion extends Cat {

    private int power;

    public Lion(String name, int power) {
        super(name);
        this.power = power;
    }

    public void rule(){
        if (power < 50 ){
            System.out.println("You so weak");
        }else{
            System.out.println("Mega-strong-super-lion");
        }
    }

    @Override
    public void sound() {
        System.out.println(this.name+" says roawr");
    }
}
