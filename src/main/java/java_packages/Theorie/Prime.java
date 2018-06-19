package java_packages.Theorie;

import java.util.Scanner;

public class Prime {



    public static void main(String[] args) {

        int rest;
        Scanner Prime = new Scanner(System.in);
        Boolean isPrime = true;

        System.out.println("Geef getal op: ");
        int a = Prime.nextInt();

        for (int i=2;i<a;i++){

            rest = a%i;
            if (rest==0) {
                isPrime = false;}
        }

        if (isPrime==false)
            System.out.println("getal is geen priem");
            
        else
            System.out.println("getal is een priem");

    }
}
