package com.hkesari.functionalProgramming.InterfaceTypes;

import java.util.function.Function;

/*Function - takes T , returns R.

     R apply(T,R)
     compose()
     andThen()
     identity()           - returns a function
*/

public class FunctionIntf {
    public static void main(String[] args){
        Function<Double,Double> half = x->x/2.0;
        Function<Double,Double> triple = x->x*3.0;

        Function<Double,Double> comp = half.andThen(triple);

        System.out.println(Function.identity());
        System.out.println(half.apply(12.0));
        System.out.println(Function.identity());
        System.out.println(comp.apply(18.0));
    }
}
