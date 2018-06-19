package java_packages.Oefeningen;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int random;
        int ingave;
        int einde=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Geef Min op: ");
        int min = input.nextInt();          // rood bolletje is een break voor de Debug, rechtsklik om condition toe te voegen
        System.out.println("Geef Max op: ");
        int max = input.nextInt();

        random =(int)(min+Math.random()*((max+1)-min));

        for(int i=1;i<=3;i++){
            System.out.println("geef getal: ");
            ingave = input.nextInt();
            if (ingave==random){
                System.out.println("Juist");
                break;
            } else
                System.out.println("fout");
                einde=i;
        }
        if(einde==3){
            System.out.println("Game over");
        }


    }
}
