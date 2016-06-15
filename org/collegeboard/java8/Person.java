package org.collegeboard.java8;

/**
 * Created by SVago on 4/21/2016.
 */
public class Person {
    private final String name;
    private final int age;

    public Person(final String theName, final int theAge) {
        name = theName;
        age = theAge;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public String toString() {
        return String.format("%s - %d", name, age);
    }
}
