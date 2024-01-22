package com.hkesari.functionalProgramming.InterfaceTypes;

import java.util.function.Function;

/*Function - takes T , returns R.  R apply(T,R)*/

public class FunctionIntf {
    public static void main(String[] args){
        Function<Integer,Double> half = x->x/2.0;
        Function<Integer,Double> triple = x->x*3.0;

        Function<Integer,Double> comp = half.andThen(x->x*3.0);

        System.out.println(half.apply(12));
        System.out.println(comp.apply(12));
    }
}
