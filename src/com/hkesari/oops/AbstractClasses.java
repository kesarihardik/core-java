package com.hkesari.oops;
/*
Abstract class                             --abstraction classes have at least one abstract method.
                                             -- They can also have non-abstract methods, instance variables.

top level abstract classes cant be private and final?
abstract classes have constructors but can not be instantiated.
A class can't extend 2 abstract classes.  -- no multiple inheritance
* */

abstract class Animal {

    private final int i = 5;        //Instance variables in abs classes can be public, private etc.
    Animal(){
        System.out.println("Animal constructor called.");
    }

    //need to defne walk in all subclasses now - abstract can't be final or private
    abstract void walk();

    public void eat(){
        System.out.println("herbivore");
    }

}

 class Horse extends Animal{

    Horse()
        {
            System.out.println("Horse constructor called.");
        }

  @Override
    public void walk(){
        System.out.println("Walks on four legs.");
    }   //runtime polymorphism
}

class Kangaroo extends Animal {

    @Override
   public void walk() {
  System.out.println("Hops on 2 legs.");
 }
}

public class AbstractClasses {
    public static void main(String[] args){

        // Animal an = new Animal() ;       //abstract class can't be instantiated.
        //an.walk();

        Horse h = new Horse();
        h.walk();
        h.eat();
    }

}
