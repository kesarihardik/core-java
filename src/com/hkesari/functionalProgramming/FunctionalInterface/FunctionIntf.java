package com.hkesari.functionalProgramming.FunctionalInterface;

//Function - take one parameter and produces a result.

import java.util.function.Function;

public class FunctionIntf {
    public static void main(String[] args){
        Function<Double,Double> half = x->x/2.0;
        Function<Double,Double> triple = x->x*3.0;

        //andThen - return composite function.
        Function<Double,Double> composite = half.andThen(triple);

        // y.compose(x)  = x.andThen(y)
        Function<Double,Double> compose = triple.compose(half);

        //R apply(T t)  - takes t, return R.
        System.out.println(half.apply(12.0));
        System.out.println(composite.apply(18.0));
        System.out.println(compose.apply(18.0));


        //identity() - returns a function that always returns its input param.
        Function<Integer,Integer> id  = Function.identity();
        System.out.println(id.apply(45));
    }
}
