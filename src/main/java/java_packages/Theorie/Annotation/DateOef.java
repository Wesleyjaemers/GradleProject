package java_packages.Theorie.Annotation;

import java.lang.annotation.Annotation;
import java.util.Date;

@CustomAnnotation(reason = "heh")
public class DateOef {
    public static void main(String[] args) {


        Date d = new Date();
        System.out.println(d);
        // @Deprecated: wil zeggen dat het verouderd is.
        d.setYear(1989);
        System.out.println(d);

        // @SuppressWarnings("")

        Car c = new Car();
        String s = c.getClass().getName();
        System.out.println(s);
    }
}
