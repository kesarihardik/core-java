package com.hkesari.functionalProgramming.FunctionalInterface;

// Marker interface: empty interface. It signals jvm of special properties. e.g. Serializable, Cloneable
// it allows to call properties like Object.cloneable() etc.
//Now a days, annotations are used for signalling.

interface MarketInterface{

}

/*
Functional Interface - have exactly one abstract method & may have other static,default
& methods of Object class as well.
E.g. Runnable, Comparable

Functional interface enables functional programming.
Functional programming is a declarative style where we can bind functions in mathematical style.
In functional programming, functions are independent & capable of what variables can do.
(like passing function as parameter, returning functions etc)
types - function, consumer, supplier, predicate

*/


@FunctionalInterface
interface A0{
    int i = 3;
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

    String toString();                         //not a abstract method. its an abstract method in Object class.
    int hashCode();
}

public class FuncInterface {
    public static  void main(String[] args){
        A0.staticMethod();
    }
}
