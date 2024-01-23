package com.hkesari.functionalProgramming.InterfaceTypes;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*Consumer  - takes one argument and returns nothing. accept(), andThen()*/

public class ConsumerIntf {
        public static void main(String[] args){
        Consumer<Object> print = System.out::println;
        BiConsumer<Object,Object> printBoth = (x,y)->System.out.println(x.toString() + " " + y.toString());

        print.accept(12);
        printBoth.accept("Hari","Har");

        Consumer<String> first = x->System.out.println(x.toLowerCase());
        Consumer<String> second = x->System.out.println(x.toUpperCase());
        Consumer<String> compose = first.andThen(second);

        second.andThen(first).accept("Kesari");
        compose.accept("Kesari");

    }
}
