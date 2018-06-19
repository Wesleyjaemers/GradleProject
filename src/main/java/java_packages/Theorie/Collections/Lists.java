package java_packages.Theorie.Collections;

import java_packages.Theorie.InterfaceOef.Transport;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        ArrayList getallen = new ArrayList(); // hoeft op voorhand geen dimensie mee te krijgen
        getallen.add(15);
        getallen.add(10);
        getallen.add(3);
        getallen.add(2);
        getallen.add(2, 56); // voegt 56 toe op positie 2, de rest schuift op

        System.out.println(getallen.size());
        System.out.println(getallen.get(0));
        getallen.set(3, 8); // het cijfer op index positie '3' wordt vervangen door '8'
        System.out.println(getallen.contains(3)); // geeft weer of de waarde in de List zit
        System.out.println();

        ArrayList namen = new ArrayList();
        namen.add("Jimi");
        namen.add("Janis");
        namen.add("Amy");
        namen.add("Kurt");
        namen.add("Jim");

        printNamen(namen);
        System.out.println();

        namen.remove("Jimi");
        namen.remove("Janis");
        namen.remove("Jim");
        printNamen(namen);

        ArrayList <String> strings; //Hier kan alleen een String in gezet worden
        strings = namen;
        for (int i =0;i<strings.size();i++)
        {
        strings.set (i, strings.get(i).toUpperCase());

        }
        printNamen(strings);

        ArrayList <T> generic = new ArrayList<>();  // maakt een lijst die alleen kan opgevuld worden door objecten
                                                    // aangemaakt van subklassen van Transport

        List <T> list = new ArrayList<>(); // Hierdoor kan de ArrayList omgezet worden naar een LinkedList indien nodig

    }

    class T extends Transport{
        @Override
        public void move() {

        }

        public T(String name, String brand) {
            super(name, brand);
        }
    }


    public static void printNamen(ArrayList e) {
        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i));
        }
    }

}
