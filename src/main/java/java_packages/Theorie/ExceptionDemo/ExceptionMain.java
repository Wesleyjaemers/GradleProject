package java_packages.Theorie.ExceptionDemo;

import java.io.FileReader;
import java.lang.annotation.RetentionPolicy;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

    public static void main(String[] args) {

        //int i =5, j= 0;
        //System.out.println(i/j); // Dit gaat een error geven omdat /0 niet mogelijk is

        //String s = null;
        //System.out.println(s.toUpperCase()); // Geeft error op NullPointerException

        // int out = fac(0);
        //System.out.println(out);

        Scanner s = new Scanner(System.in);
        boolean badNumber = true;
        while (badNumber)
        try {
             // als de gebruiker geen getal ingeeft komt er een error: numberFormatException
            System.out.println("Geef een getal op");
           int getal = s.nextInt();
            System.out.println("Print getal: "+getal);
            badNumber =false;
        } catch(InputMismatchException e){
            System.out.println("er is een foute invoer gebeurd");
            e.getMessage();
            s.nextLine();
        }
        catch (NullPointerException e){
            System.out.println("Er is een foute invoer gebeurd");
            e.getStackTrace();  // geeft weer op welke stack de fout gebeurd is
            s.nextLine();
        }
        //catch (RuntimeException e) {  // Als er meerdere catches moeten gebeuren onder DEZELFDE hiërarchie kun je de bovenstaande Exception gebruiken
           // System.out.println("Er is een foute invoer gebeurd");
        //}

       // catch (ArithmeticException | NullPointerException e){ // ook een optie om meerdere catches te groeperen
        //    System.out.println(e.getMessage());
        //}
        finally { // wat er ook gebeurd, de finally block wordt altijd uitgevoerd.
            System.out.println("klaar");
        }


        //RetentionPolicy.valueOf("KEVIN"); // KEVIN komt niet voor in de enumeration, dus error.

        // FileReader r = new FileReader("input.exe"); // Kan geef file uitlezen als deze niet bestaat.
    }



    /*private static int fac(int i) { // recursive: de functie blijft zichzelf uitvoeren tenzij de loop gestopt wordt
        if (i <= 1) {                   // hier door ervoor te zorgen dat dit stop als het 1 bereikt heeft, anders blijft functie doorgaan en krijgen we Stack overflow.
            return 1;
        }
        return i * fac(i - 1);
    }*/



    /*public static void f(int i) {  // recursive functie: een functie die zichzelf aanspreekt

        System.out.println("Value " + i);
        f(i + 1);
    }*/

}

