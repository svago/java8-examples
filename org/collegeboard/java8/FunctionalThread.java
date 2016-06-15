package org.collegeboard.java8;

import java.util.function.BinaryOperator;

/**
 * Created by SVago on 4/15/2016.
 */
public class FunctionalThread {
    public static void main(String[] args) {


        String name = "steve";
        Thread th = new Thread(() -> System.out.println(name + " is in another thread"));
        th.start();

        //multi line lambda
        Runnable multistatement = () -> {
            int x = 99;
            System.out.println(String.format("the number in the third thread is %d",x));
        };


        new Thread( multistatement  ).start();
        System.out.println("In main");
    }


}
