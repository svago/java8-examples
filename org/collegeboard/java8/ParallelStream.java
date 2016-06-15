package org.collegeboard.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by SVago on 5/23/2016.
 */
public class ParallelStream {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Timeit.code(() ->
                System.out.println(
//      numbers.stream()
                        numbers.parallelStream()
                                .filter(e -> e % 2 == 0)
                                .mapToInt(ParallelStream::compute)
                                .sum()));
    }
    public static int compute(int number) {
        //simulate a time intensive process
        try { Thread.sleep(1000); } catch(Exception ex) {}
        return number * 2;
    }
}
