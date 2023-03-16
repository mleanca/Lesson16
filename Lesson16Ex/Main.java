package Lesson16Ex;

import java.util.HashSet;
public class Main {

    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();
        persons.add(new Person("Dima", 27));
        persons.add(new Person("Gheorghe", 44));
        persons.add(new Person("Lidia", 61));
        persons.add(new Person("Victor", 63));
        persons.add(new Person("Diana", 52));

        for (Person person : persons) {
            if (person.getAge() > 60) {
                System.out.println(person.toString());
            }
        }
    }

    //methods equals() and hashCode() are used to implicitly compare objects of Person class based on values of age and nameS

    //Name: Victor, age: 63
    //Name: Lidia, age: 61
}
