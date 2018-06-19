package java_packages.Theorie.Collections;

import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        Set<Person> names = new TreeSet<>();
        names.add(new Person ("Erik", "Kire", 25));
        names.add(new Person ("guy", "zwangere", 27));
        names.add(new Person ("lqj", "mqsidf", 30));

    }


}

class Person implements Comparable<Person> {

    private String lastname;
    private String firstname;
    private int age;

    @Override
    public int compareTo(Person that) {
        return this.age -that.age;
    }
    public Person(String lastname, String firstname, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}