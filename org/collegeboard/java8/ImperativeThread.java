package org.collegeboard.java8;

/**
 * Created by SVago on 4/15/2016.
 */
public class ImperativeThread {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In another thread");
            }
        });
        th.start();

        System.out.println("In main");
    }
}
