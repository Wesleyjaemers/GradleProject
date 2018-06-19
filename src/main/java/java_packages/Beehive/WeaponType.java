package java_packages.Beehive;

public enum WeaponType {

    SWORD(40),
    AXE(30),
    SPEAR(20),
    BOW(10);

    public final int power;

    WeaponType(int power){
        this.power = power;

    }
}
