package com.hkesari.functionalProgramming.InterfaceTypes;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*Predicate - takes one parameter, returns boolean
* Predicate methods - test(), negate(), and(), or()
* */

public class PredicateIntf {
    public static void main(String[] args){
        List<Integer> yearList = Arrays.asList(2004,2006,2009,2012,2024,1996);
        Predicate<Integer> isDivisibleBy4  = (x)->x % 4==0;
        Predicate<Integer> isDivisibleBy100 = (x)->x%100==0;
        Predicate<Integer> isDivisibleBy400 = (x)->x%400==0;

        yearList.stream().filter(isDivisibleBy4.and(isDivisibleBy100.negate()).or(isDivisibleBy400))
                .forEach(System.out::println);

        BiPredicate<Integer,Integer> isTeenage = (x,y)->x>=13&&y<=18;
    }
}
