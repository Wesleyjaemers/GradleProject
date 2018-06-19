package java_packages.UnitTestingClasses;

import java.util.InputMismatchException;

import static java.lang.Math.abs;

public class Fraction {

    private int teller, noemer;
    private boolean out=false;


    public int getTeller() {
        return teller;
    }

    public int getNoemer() {
        return noemer;
    }


    public Fraction(int teller, int noemer) {
        if(noemer == 0) {
            throw new IllegalArgumentException("Noemer mag niet 0 zijn");
        }
        /*while (out == false)
            try {
                if (noemer == 0) {
                    throw new InputMismatchException();
                }*/
                this.teller = teller;
                this.noemer = noemer;

           /* }catch (InputMismatchException e){
        System.out.println("Nominator can't be zero");
        out = true;
        }*/
    }

    public Fraction multiply (Fraction b){

        return new Fraction (this.teller*b.teller, this.noemer*b.noemer);
    }

    public Fraction substract (Fraction a){
        return new Fraction ((this.getTeller()*a.getNoemer())-(this.getNoemer()*a.getTeller()), this.getNoemer()*a.getNoemer());
    }

    public Fraction add (Fraction a){
        return new Fraction ((this.getTeller()*a.getNoemer())+(this.getNoemer()*a.getTeller()), this.getNoemer()*a.getNoemer());
    }

    public Fraction divide (Fraction a){

        return this.multiply(a.inverse());
    }

    public Fraction inverse(){
        return new Fraction(this.getNoemer(),this.getTeller());
    }

    public Fraction vereenvoudig(Fraction a){
        int b = Fraction.greatestCommonFactor(a.getTeller(),a.getNoemer());
        return new Fraction(a.getTeller()/b,a.noemer/b);
    }



    public static int greatestCommonFactor(int a, int b) {
        if(a == 0 || b == 0) {
            return 1;
        }
        a = abs(a);
        b = abs(b);
        if(a < b) {
            return greatestCommonFactor(b, a);
        }

        int delta = a % b;
        if(delta == 0) {
            return b;
        } else {
            return greatestCommonFactor(b, delta);
        }
    }
}
