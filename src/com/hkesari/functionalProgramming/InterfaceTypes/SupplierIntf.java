package com.hkesari.functionalProgramming.InterfaceTypes;

import java.util.function.Supplier;

/*Supplier - return a value. get(),*/

public class SupplierIntf {
    public static void main(String[] args){
        Supplier<Double> random = Math::random;
        System.out.print(random.get());
    }
}
