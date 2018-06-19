package java_packages.Theorie.ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MegacalcMain {
    public static void main(String[] args) {

        //int a = isNumber();
        //int b = isNumber();
        String berekening = isString();

    }
    public static int isNumber(){
        Scanner s = new Scanner(System.in);
        boolean badNumber = true;
        int i=0;
        while(badNumber)
            try {
                System.out.println("Geef getal:");
                i = s.nextInt();
                badNumber = false;
            }catch(InputMismatchException e){
                System.out.println("Verkeerde invoer");
                s.next();
            }
        return i;
    }

    public static String isString(){
        Scanner s = new Scanner(System.in);
        boolean badFunction = true;
        String input = null;
        while (badFunction)
            try {
                System.out.println("Geef methode: ");
                input = s.nextLine();
                input = input.toUpperCase();
                Functions.valueOf(input);
                badFunction = false;
            }catch(IllegalArgumentException e){
                System.out.println("Ne STRING JONGUH");
            }
            return input;
    }


}
