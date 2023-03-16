package Lesson16Ex;


public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    //equals() compares two objects of Person
    public boolean equals(Object object) {
        if (object == this) {
            return true;
            //if object is the same as object referred 'this', returns true
        }
        if (!(object instanceof Person)) {
            return false;
            //returns false if object is NOT an instance of Person
        }
        Person other = (Person) object;
        return this.name.equals(other.name) && this.age == other.age;
        //casting the object as Person, named other
        //checks if name of this is equal to name of other, same applies for age
        //returns true if both conditions are true
        //if either is false, returns false
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 + result + name.hashCode();
        result = 31 + result + age;
        return result;
        //17 and 31 prime number commonly used to initialize and override HashCode
        //researched from stack overflow, but still do not understand
    }

    public String toString() {
        return "Name: " + name + ", age: " + age;
    }
}
