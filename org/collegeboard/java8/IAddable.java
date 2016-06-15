package org.collegeboard.java8;

/**
 * Created by SVago on 4/18/2016.
 */
@FunctionalInterface
public interface IAddable<T> {
    public T add(T t1, T t2);
}
