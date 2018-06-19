package java_packages.Theorie;

import java.util.Scanner;

public class Random {

    public static int berekenRandomGetal (int min, int max){
        int rand;
        rand =(int)(min+Math.random()*((max+1)-min));
        return rand;      //teruggeven van de waarde
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Geef Min op: ");
        int min = input.nextInt();          // rood bolletje is een break voor de Debug, rechtsklik om condition toe te voegen
        System.out.println("Geef Max op: ");
        int max = input.nextInt();

        System.out.println(Random.berekenRandomGetal(min, max));

    }
}
