package java_packages.Theorie.ExceptionDemo;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Exception2 {

    public static void main(String[] args) {

        double input = 21152.5556;
        String input2 = "1.564,45euro";
        String res;
        double res2 = 0;

        DecimalFormat d = new DecimalFormat("#,##0.00euro");//#,##0.00 Dit format geeft 2 cijfers na de komma en zet een . vanaf het duizendtal (naargelang de regio)
        res = d.format(input);
        if (input<0){
            throw new TisKapot("te laag getal", "loemp");
        }
        try {
            res2 =(double) d.parse(input2);
        } catch (ParseException e) {
        }

        System.out.println("andere notatie: "+res);
        System.out.println("andere notatie 2: "+res2);
    }
}
