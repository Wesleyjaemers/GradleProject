package java_packages.Theorie.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaMain {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Janis", "Joplin", 25));
        people.add(new Person("Erik", "buh", 30));
        people.add(new Person("Jimi", "Hendrix", 35));

        Comparator<Person> c = new PersonByFirstNameComparator();

        Comparator<Person> c2 = new Comparator<Person>() {  //methode die 'on the spot' wordt aangemaakt. Alleen maar bruikbaar op deze plaats (heeft geen naam)
            public int compare(Person a, Person b) {         // Anonymous inner class
                return a.getFirstname().compareTo(b.getFirstname());
            }
        };

        Comparator<Person> c3 = (Person a, Person b) -> {  //Dezelfde methode maar iets korter met lambda
        return a.getFirstname().compareTo(b.getFirstname());
    };

        Comparator<Person> c4 = (a, b) -> {
            return a.getFirstname().compareTo(b.getFirstname());
        };

        Comparator<Person> c5 = (a, b) -> a.getFirstname().compareTo(b.getFirstname());


        Comparator<Person> c7 = Comparator.comparing(Person::getFirstname); //Vereenvoudiging van IntelliJ

        Comparator<Person> c6 = LambdaMain::bladibla; //Roept de static methode aan om uit te voeren.

        people.sort(c2);

        for (Person person: people) {
            System.out.println(person);
        }



    }
    public static int bladibla  (Person a, Person b){
        return a.getFirstname().compareTo(b.getFirstname());

    }
}
