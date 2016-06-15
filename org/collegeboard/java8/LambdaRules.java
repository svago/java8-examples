package org.collegeboard.java8;

import java.util.function.BinaryOperator;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntBinaryOperator;

/**
 * Created by SVago on 4/18/2016.
 */
public class LambdaRules {

    public static void main(String[] args) {
        BinaryOperator<Integer> addIntegers = (x,y) -> x+y; //multi parameter, parens required
        System.out.println(addIntegers.apply(4,5));

        final IntBinaryOperator addExplicit = (int x, int y) -> x + y; //explicit parameter typing
        System.out.println( addExplicit.applyAsInt(1,2)  );


        final IntBinaryOperator addImplicitTypes = ( x,  y) -> x + y; //type inference
        System.out.println(addImplicitTypes.applyAsInt(2,3));

        String a = "a";
        a = "aa";
        IAddable<String> stringAdder = (  s1,   s2) -> s1+s2;  //lambda implements our custom functional interface
        System.out.println(stringAdder.add(a,"b"));

        IDoSomething<Integer> doubler = (s1) -> s1 * 2; //single paremeter with parens
        System.out.println( doubler.doIt(3));
        doubler.doSomethingElse();

        IDoSomething<Integer> doubler2 = s1 -> s1 * 2; //single parameter, optional parens, implicit return type
        Integer x = doubler2.doIt(33);
        System.out.println( x);

        IDoSomething<Integer> doubler3 = (Integer  s1) -> s1 * 2; //parens required if type is explicit


        Integer y = 33;
//        y = 34;
        IDoSomething<Integer> localVariableDoSomething = s1 ->  s1 + y; //y must be final or effectively final
        Integer y2 = localVariableDoSomething.doIt(y);
        System.out.println(y2);


    }



}
