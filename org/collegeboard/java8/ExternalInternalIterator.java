package org.collegeboard.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by SVago on 5/19/2016.
 */
public class ExternalInternalIterator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //external iterators
        System.out.println("external iterator example");
         for(int i = 0; i < numbers.size(); i++) {
           System.out.println(numbers.get(i));
         }

        System.out.println("second external iterator example");
//        external iterators also
         for(int e : numbers) {
           System.out.println(e);
         }

        System.out.println("internal iterator with anonymous inner class");
//    internal iterators
        numbers.forEach(new Consumer<Integer>() {
            public void accept(Integer value) {
                System.out.println(value);
            }
        });


        // numbers.forEach((Integer value) -> System.out.println(value));  //strongly typed parameter

        //numbers.forEach((value) -> System.out.println(value)); //type inference on a parameter

        numbers.forEach(value -> System.out.println(value)); //parenthesis is optional, but only for one parameter lambdas.

        numbers.forEach(System.out::println); //method reference
    }
}
