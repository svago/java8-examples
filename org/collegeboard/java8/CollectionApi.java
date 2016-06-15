package org.collegeboard.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by SVago on 5/23/2016.
 */
public class CollectionApi {
    public static void main (String[] args){
        List<String> strings = Arrays.asList("a","b","hello");

        List<String> collected = strings.stream()
                                .map(String::toUpperCase)
                                .collect(Collectors.toList());
        System.out.println(collected);
    }
}
