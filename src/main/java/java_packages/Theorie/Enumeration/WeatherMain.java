package java_packages.Theorie.Enumeration;

import java.util.Scanner;

public class WeatherMain {

    public static void main(String[] args) {

        String month;
        boolean badMonth = true;
        while (badMonth) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Geef de maand op");
                month = s.next().toUpperCase();
                System.out.println("De gemiddelde statistieken voor " + month + " zijn: \n" +
                        "Temperatuur: " + WeatherEnum.valueOf(month).getTemperature() + "° \n" +
                        "Regenval: " + WeatherEnum.valueOf(month).getRainfall() + "mm \n" +
                        "Uren zon: " + WeatherEnum.valueOf(month).getSunshineHours() + " uren");
                badMonth = false;
            } catch (IllegalArgumentException e) {
                System.out.println("foute invoer");
            }

        }


        WeatherEnum [] months = WeatherEnum.values(); // haalt een array op van alle enums
        for (WeatherEnum m: months) { // print array
            System.out.println(m);
        }
    }

}
