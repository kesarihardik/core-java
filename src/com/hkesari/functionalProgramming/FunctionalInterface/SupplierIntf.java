package com.hkesari.functionalProgramming.FunctionalInterface;

//Supplier - return a value.
public class SupplierIntf {
    public static void main(String[] args){
        java.util.function.Supplier<Double> random = Math::random;
        System.out.print(random.get());
    }
}
