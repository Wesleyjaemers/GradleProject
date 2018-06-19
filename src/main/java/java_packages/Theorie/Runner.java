package java_packages.Theorie;

public class Runner {
    public static void main(String[] args) {

        //Wiskundige methodes

        //variabele input

        int x = 5;
        int c = 10;
        int m1 = 20;
        int m2 = 30;
        double n = 20;
        double r = 15;

        //constante
        double g = 6.67e-11;

        //Methodes
        double a = Math.PI * (Math.sqrt(r));

        double b = 2 * Math.PI * r;

        double y = 2 * x + Math.sin(x/3);

        double z = c + (3 * Math.sqrt(x))/2;

        double f = g * ((m1 * m2)/(Math.sqrt(Math.PI)));

        double e = (2*(Math.log10(n))) / Math.sqrt(n);


        System.out.println(a);
        System.out.println(b);
        System.out.println(y);
        System.out.println(z);
        System.out.println(f);
        System.out.println(e);

    }
}
