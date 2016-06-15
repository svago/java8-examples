package org.collegeboard.java8;

/**
 * Created by SVago on 4/19/2016.
 */
@FunctionalInterface
public interface IDoSomething<T>{
    public T doIt(T t1);
    default void doSomethingElse(){
        System.out.println("inside the default method");
    }

}
