package java_packages.Oefeningen;

import java.util.Scanner;

public class Faculteit {
    public static void main(String[] args) {

        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Geef getal op:");
        int fac = input.nextInt();
        res=fac;

        for (int i=1;i<fac;i++){
            res = res*(fac-i);
        }
        System.out.println("Faculteit van "+fac+" is: "+res);
    }
}
