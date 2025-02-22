package com.hkesari.functionalProgramming.FunctionalInterface;

import java.util.function.BiConsumer;

/*Consumer  - takes one argument and returns nothing. accept(), andThen()*/

public class ConsumerIntf {
        public static void main(String[] args){
        java.util.function.Consumer<Object> print = System.out::println;
        BiConsumer<Object,Object> printBoth = (x,y)->System.out.println(x.toString() + " " + y.toString());

        print.accept(12);
        printBoth.accept("Hari","Har");

        java.util.function.Consumer<String> first = x->System.out.println(x.toLowerCase());
        java.util.function.Consumer<String> second = x->System.out.println(x.toUpperCase());
        java.util.function.Consumer<String> compose = first.andThen(second);

        second.andThen(first).accept("Kesari");
        compose.accept("Kesari");

    }
}
