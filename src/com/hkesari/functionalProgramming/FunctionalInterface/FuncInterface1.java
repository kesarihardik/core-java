package com.hkesari.functionalProgramming.FunctionalInterface;

import java.util.function.Supplier;

//Supplier - return a value.
public class FuncInterface1 {
    public static void main(String[] args){
        Supplier<Double> random = Math::random;
        System.out.print(random.get());
    }
}
