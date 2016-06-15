package org.collegeboard.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by SVago on 5/20/2016.
 */
public class FunctionComposition {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //given the values, double the even numbers and total.

        int result = 0;

        //the imperative approach
        for(int e : numbers) {
            if(e % 2 == 0) {
                result += e * 2;
            }
        }

        System.out.println(result);

        System.out.println(
                numbers.stream()
                        .filter(e -> e % 2 == 0)  //select even numbers...filter takes a Predicate, a boolean-valued function
                        .map(e -> e * 2) //multiply by 2...map invokes a function...return type doesn't have to match input
                        .reduce(0,Integer::sum)); //get the total...a terminal operation

        //even more
        System.out.println(
                numbers.stream()
                        .filter(e -> e % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum());
    }

}
