package org.collegeboard.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by SVago on 4/21/2016.
 */
public class UseOptional {
    public static void main(String[] args){
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jack", 33)
                );

        final String startLetter = "J" +
                "";
        final Optional<String> endResult =
        people.stream()
                .filter(p -> p.getName().startsWith(startLetter))
                .map(Person::toString)
                .findFirst();
        System.out.println(endResult);
        System.out.println(String.format("person whose name starts with '%s': %s", startLetter, endResult.orElse("no one found")));
        endResult.ifPresent(x -> System.out.println(x));  //illustrate use of ifPresent


        List<String> collectionResult =
                people.stream()
                .filter(p -> p.getName().startsWith(startLetter))
                .map(Person::toString)
                .collect(Collectors.toList());

        //if no results found then the result is an empty list, not a null reference...i
        System.out.println("collection result: "+ collectionResult);
    }
}
