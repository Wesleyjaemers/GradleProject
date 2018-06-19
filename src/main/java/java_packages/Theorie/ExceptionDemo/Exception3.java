package java_packages.Theorie.ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {

    public static int ScanGetal () {

        try(Scanner s = new Scanner(System.in)){ // Hierdoor wordt er automatisch s.close() gedaan na de try/catch
            s.nextInt();

        }catch (InputMismatchException e){
            System.out.println("Catching");

        }
        return 0;
    }
}
