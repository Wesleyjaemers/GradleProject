package java_packages.Oefeningen;

import java.util.Scanner;

public class RandomPrime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Geef Min op: ");
        int min = input.nextInt();          // rood bolletje is een break voor de Debug, rechtsklik om condition toe te voegen
        System.out.println("Geef Max op: ");
        int max = input.nextInt();

        int tussenRes = Randomizer.berekenRandom(min, max);
        boolean res = ComparePrime.isPrime(tussenRes);

        System.out.println("Random getal = "+ tussenRes);
        if (res==false)
            System.out.println("getal "+tussenRes+" is geen priem");

        else
            System.out.println("getal "+tussenRes+" is een priem");

    }
}
