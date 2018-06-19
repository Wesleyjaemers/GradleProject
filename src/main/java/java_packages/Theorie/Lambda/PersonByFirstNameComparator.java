package java_packages.Theorie.Lambda;

import java.util.Comparator;

public class PersonByFirstNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        return a.getFirstname().compareTo(b.getFirstname());  //Hier wordt er gesorteerd op voornaam

    }
}
