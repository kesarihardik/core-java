package com.hkesari.oops;
/*
Abstract class                             --abstraction classes have at least one abstract method.
                                           -- They can also have non-abstract methods, instance variables.

top level abstract classes/ interfaces cant be private and final.
abstract methods can't be private, final.
abstract classes have constructors but can not be instantiated.
A class can't extend 2 abstract classes.  -- no multiple inheritance
* */

abstract class Animal {
    Animal(){
        System.out.println("Animal constructor called.");
    }

    //need to defne walk in all subclasses now - abstract can't be final,static or private
    abstract void walk();

    public void eat(){
        System.out.println("herbivore");
    }

    public int y = 5;

    public static final int i = 5;         //static fields are inherited(shared) but not overridden.

    public static void foo(){}       //static methods aren't inherited

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
        System.out.println(h.y);

        //static fields are accessible to subclasses.
        System.out.println(Horse.i);


    }

}
