package com.hkesari.functionalProgramming.InterfaceTypes;

/*
Marker interface -  empty interface. It signals jvm of special properties. e.g. Serializable, Cloneable
Functional Interface - have exactly one abstract method and may have other static,default & methods of Object class as well.
                        E.g. Runnable, Comparable
                       Functional interface enables functional programming. In functional programming, functions are independent & capable of what variables can do.(like passing function as parameter, returning functions etc)
                        types - function, consumer, supplier, predicate
 */

// Marker interface
interface MarketInterface{

}

@FunctionalInterface
interface A0{
    static int i = 3;
    void abstractMethod();
    public static void staticMethod(){
        System.out.println("static method called.");
    }
    default void defaultMethod(){
        System.out.println("default method called.");
    }

    default void defaultMethod2(){
        System.out.println("default method 2 called.");
    }

    String toString();
    int hashCode();
}

public class FunctInterface {
    public static  void main(String[] args){
        A0.staticMethod();

    }
}
