package java_packages.Oefeningen;

public class Randomizer {

    public static int berekenRandom(int min, int max){
        int rand;
        rand =(int)(min+Math.random()*((max+1)-min));
        return rand;
    }
}
