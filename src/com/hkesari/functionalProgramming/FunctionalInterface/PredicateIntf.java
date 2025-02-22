package com.hkesari.functionalProgramming.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

//Predicate - takes one parameter, returns boolean

public class PredicateIntf {
    public static void main(String[] args){
        List<Integer> yearList = Arrays.asList(2004,2006,2009,2012,2024,1996);
        java.util.function.Predicate<Integer> isDivisibleBy4  = (x)->x % 4==0;
        java.util.function.Predicate<Integer> isDivisibleBy100 = (x)->x%100==0;
        java.util.function.Predicate<Integer> isDivisibleBy400 = (x)->x%400==0;

        //and, or, negate() - return Predicate
        yearList.stream().filter(isDivisibleBy4.and(isDivisibleBy100.negate()).or(isDivisibleBy400))
                .forEach(System.out::println);

        //test()  - returns boolean
        BiPredicate<Integer,Integer> areEven = (x,y)->(x&1)!=1 && (y&1)!=1;
        System.out.println(areEven.test(34,22));
    }
}
