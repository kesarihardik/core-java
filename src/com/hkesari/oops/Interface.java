package com.hkesari.oops;
/*
Interface          100% abstraction. Methods here have no implementation/ declaration. It contains only method signature/ declaration.
                   Contract : Class inheriting interface must implement those methods.
                   Interfaces don't have constructor unlike abstract class.

In modern Java, interfaces can have default methods and private methods which contain their own implementation.

Interface can inherit one or more interfaces. --since multiple inheritance works with interfaces.

Interfaces can't be final/ private.
Fields inside interface are public,static and final by default.
Static fields of interfaces are shared by implementing classes unless hidden due to re-defined again.

*/
interface Mammal{
    int eyes = 2;        //public static and final field
    void walk();

    //Java 8 allows to define default implementation of methods
    default void sound(){
        System.out.println("Default Sound.");
    }

    //private methods of interface must have body
    private void foo() {

    }

    //static methods  - not inherited by implementing classes
    private static void hoo(){}

}


interface Herbivore {
    void travel();
}

 class Lion implements Mammal,Herbivore{                     //Multiple inheritance
    @Override
    public void walk() {
        System.out.println("Lion walks on 4 legs");
    }

     @Override
    public void travel() {
        System.out.println("Lion travels on 4 legs");
    }
}

public class Interface{
    public static void main(String[] args){
        Mammal l = new Lion();          //loose coupling. reference variable of superclass points to subclass.
        l.walk();
        l.sound();

        System.out.println(Mammal.eyes);
        System.out.println(l.eyes);
        System.out.println(Lion.eyes);
        //        l.hoo()         -- static method not inherited.
    }

}
