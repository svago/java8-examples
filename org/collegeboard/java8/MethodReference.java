package org.collegeboard.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by SVago on 4/21/2016.
 */
public class MethodReference {
    public static void main(String[] args){
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 34),
                new Person("Greg", 35));

        Stream.of("a","b","c")
                .map(String::toUpperCase)
                .forEach((x) -> System.out.println(x)); //can be converted to a method reference

        people.stream()
                .map(Person::toString)      //reference to an instance method
                .forEach(System.out::println);
    }
}
