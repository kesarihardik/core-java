package com.hkesari.oops;
/*
Abstract class                             --abstraction classes have at least one abstract method.
                                             -- They can also have non-abstract methods, instance variables.

top level abstract methods/ interfaces  cant be private?
abstract class can not be instantiated.
abstract classes have constructors unlike interfaces.
A class can't extend 2 abstract classes.  -- no multiple inheritance
Instance variables in abs classes can be public, private etc.

* */

abstract class Animal {
    Animal(){
        System.out.println("Animal constructor called.");
    }

    abstract void walk(); //need to defne walk in all subclasses now

    public void eat(){
        System.out.println("herbivore");
    }

}

//runtime polymorphism
 class Horse extends Animal{

    Horse()
        {
            System.out.println("Horse constructor called.");
        }

  @Override
    public void walk(){
        System.out.println("Walks on four legs.");
    }
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
