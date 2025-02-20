package com.hkesari.oops;
/*
Interface          100% abstraction. Methods here have no implementation/ declaration. It contains only method signature/ declaration.
                   Contract : Class inheriting interface must implement those methods.

Interface can inherit one or more interfaces. --since multiple inheritance works with interfaces.

Fields inside interface are public,static and final by default.
Interfaces don't have constructor.
Interfaces can't be final/ private.
*/
interface Mammal{
    int eyes = 2;        //static member
    void walk();

    //Java 8 allows to define default implementation of methods
    default void sound(){
        System.out.println("Default Sound.");
    }

    //private methods of interface must have body
    private void foo() {

    }

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
        Lion l = new Lion();
        l.walk();
        l.sound();


        System.out.println(Mammal.eyes);
        System.out.println(l.eyes);            //static member is accessible without object.
    }

}
