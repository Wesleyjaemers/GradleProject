package java_packages.Theorie.Lambda;

public class Person implements Comparable <Person> {

    private String firstname, lastname;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String toString (){
        return firstname + " " + lastname + " " + age;
    }


    @Override
    public int compareTo(Person that) {

        return this.lastname.compareTo(that.lastname);
    }

}
